public se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType removeRoomType(se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType roomType) {
    for (int i = 0; i < (roomTypes.size()); i++) {
        if ((roomTypes.get(i)) == roomType) {
            return ((se.chalmers.cse.mdsd1617.group18.roomManager.IRoomType) (roomTypes.remove(i)));
        }
    }
    return null;
}