public boolean lowerRoom(int roomID) {
    int prev_level = rooms_list.get(roomID).getLevel();
    rooms_list.get(roomID).lower();
    return prev_level > (rooms_list.get(roomID).getLevel());
}