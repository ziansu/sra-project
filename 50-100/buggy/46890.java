public int getHigherLevel(int level) {
    int higher = java.lang.Integer.MAX_VALUE;
    for (mff.mapGenereator.Room room : owners) {
        if (((room.getLevel()) < higher) && ((room.getLevel()) > level)) {
            higher = room.getLevel();
        }
    }
    return higher;
}