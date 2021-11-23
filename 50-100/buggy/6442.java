public void scroll(int steps) {
    int scrollVel = steps;
    if (steps < 0) {
        if (steps < (timesoffY)) {
            scrollVel = timesoffY;
        }
    }
    if ((steps > 0) && ((timesoffY) > (maxOffsetY))) {
        timesoffY = maxOffsetY;
        scrollVel = 0;
    }
    timesoffY -= scrollVel;
}