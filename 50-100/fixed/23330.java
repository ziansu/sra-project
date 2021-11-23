public static int cellFreeIn(int currentTime, source.Position pos) {
    int time = 0;
    for (int t = currentTime; t < (source.GameMap.timeController.size()); t++) {
        if (!(source.GameMap.isPositionOccupiedToTime(pos, t))) {
            return time;
        }
        time++;
    }
    return -1;
}