private void clearUnreadCounters(org.matrix.androidsdk.data.RoomSummary summary) {
    getLiveState().setHighlightCount(0);
    getLiveState().setNotificationCount(0);
    mStore.storeLiveStateForRoom(getRoomId());
    summary.setUnreadEventsCount(0);
    mStore.flushSummary(summary);
    mStore.commit();
}