public Room retrieveRoomFromNumber(int roomid) {
    Room c;
    Room a = new Room();
    java.util.Iterator it = rooms.iterator();
    for (int i = 0; it.hasNext(); i++) {
        c = rooms.get(i);
        if ((c.RoomNumber) == roomid) {
            a = c;
        }else {
            a = null;
        }
    }
    return a;
}