public int getLastTime() {
    bms.model.TimeLine[] times = getAllTimeLines();
    java.util.Arrays.sort(times);
    for (int i = (times.length) - 1; i > 0; i--) {
        for (int lane = 0; lane < 18; lane++) {
            if (times[i].existNote(lane)) {
                return times[i].getTime();
            }
        }
    }
    return 0;
}