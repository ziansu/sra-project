@java.lang.Override
public void onFailure() {
    com.example.netlog.service.DbActionService.postEvent(new com.example.netlog.bus.DatabaseEvent(mAction, com.example.netlog.bus.DatabaseEvent.STATE_FAIL));
}