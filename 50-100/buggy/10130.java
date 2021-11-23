private void updateBestTimes(float recentTime) {
    curTime.setText(("current time: " + (java.lang.String.valueOf(recentTime))));
    if (recentTime <= (bestTimeTracker)) {
        bestTimeTracker = recentTime;
        bestTime.setText(("best time: " + (bestTimeTracker)));
    }
    if (recentTime >= (worstTimeTracker)) {
        worstTimeTracker = recentTime;
        worstTime.setText(("worst time: " + (worstTimeTracker)));
    }
}