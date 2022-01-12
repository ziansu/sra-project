public int getLowerLevel(int level) {
    int lower = java.lang.Integer.MIN_VALUE;
    for (mff.mapGenereator.Room room : owners) {
        if (((room.getLevel()) > lower) && ((room.getLevel()) < level)) {
            lower = room.getLevel();
        }
    }
    return lower;
}