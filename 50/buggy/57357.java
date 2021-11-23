@java.lang.Override
public void onStop() {
    super.onStop();
    rtdc.core.event.Event.unsubscribe(FetchUnitsEvent.TYPE, this);
    rtdc.core.event.Event.unsubscribe(ActionCompleteEvent.TYPE, this);
}