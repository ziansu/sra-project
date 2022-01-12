public void deleteFloor(int x, int y) {
    for (int scan = 0; scan < (floors.size()); scan++) {
        if (((floors.get(scan).xPosition) == x) && ((floors.get(scan).yPosition) == y)) {
            floors.remove(scan);
        }
    }
}