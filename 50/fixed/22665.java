@java.lang.Override
public void onProgressUpdate(final int progress) {
    com.example.netlog.service.DbActionService.postEvent(new com.example.netlog.bus.DatabaseEvent(mAction, com.example.netlog.bus.DatabaseEvent.STATE_IN_PROGRESS, progress, 100, null));
}