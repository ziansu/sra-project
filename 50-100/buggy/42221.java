public boolean inRoom(int x, int y, int offset) {
    if ((((x > ((room_x) + offset)) && (x < (((room_x) + (room_h)) - offset))) && (y > ((room_y) + offset))) && (y < (((room_y) + (room_w)) - offset))) {
        return true;
    }
    return false;
}