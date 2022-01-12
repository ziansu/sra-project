public void editEvent(int position) {
    org.hisp.dhis2.android.sdk.events.MessageEvent message = new org.hisp.dhis2.android.sdk.events.MessageEvent(BaseEvent.EventType.showDataEntryFragment);
    message.item = displayedExistingEvents.get(position).localId;
    Dhis2Application.bus.post(message);
}