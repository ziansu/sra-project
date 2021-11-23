public java.lang.String getRoomName(final java.lang.String roomKey) {
    com.pajato.android.gamechat.chat.model.Room room = roomMap.get(roomKey);
    return room != null ? room.name : "Anonymous";
}