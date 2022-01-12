public boolean lowerRoom(int roomID) {
    int prev_level = rooms_list.get(roomID).getLevel();
    rooms_list.get(roomID).lower();
    if (prev_level > (rooms_list.get(roomID).getLevel()))
        return true;
    else
        return false;
    
}