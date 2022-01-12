Room east(Room ro, Rooms loc) {
    Room r = ro;
    int roomNum = ro.getEast();
    if (roomNum == (-1)) {
        syntaxError();
    }else {
        r = loc.getRoom(roomNum);
    }
    return r;
}