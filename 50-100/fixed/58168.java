public Room retrieveRoomFromNumber(int roomid) {
    Room c;
    Room a = null;
    java.util.Iterator it = rooms.iterator();
    for (int i = 0; i < (rooms.size()); i++) {
        c = rooms.get(i);
        if ((c.RoomNumber) == roomid) {
            a = c;
        }else {
            a = null;
        }
    }
    return a;
}