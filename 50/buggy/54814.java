@java.lang.Override
public void run() {
    if ((null != (mNotifiedEventsByRoomId)) && (mNotifiedEventsByRoomId.containsKey(roomId))) {
        mNotifiedEventsByRoomId = null;
        refreshMessagesNotification();
    }
}