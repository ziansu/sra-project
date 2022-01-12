Room east(Room ro, Rooms loc) {
    int roomNum = ro.getEast();
    if (roomNum == (-1)) {
        syntaxError();
    }else {
        ro = loc.getRoom(roomNum);
    }
    return ro;
}