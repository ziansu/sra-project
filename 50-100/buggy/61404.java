public int getBadgeCount() {
    int badgeCount = 0;
    for (org.matrix.androidsdk.data.Room room : mFilteredRooms) {
        if (room.getDataHandler().getBingRulesManager().isRoomMentionOnly(room.getRoomId())) {
            badgeCount += room.getHighlightCount();
        }else {
            badgeCount += room.getNotificationCount();
        }
    }
    return badgeCount;
}