public void removeRoomType(se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType roomType) {
    for (int i = 0; i < (roomTypes.size()); i++) {
        if ((roomTypes.get(i)) == roomType) {
            roomTypes.remove(i);
        }
    }
}