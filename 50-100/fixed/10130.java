private void updateBestTimes(float recentTime) {
    curTime.setText(("current time: " + (java.lang.String.valueOf(recentTime))));
    if (recentTime <= (bestTimeTracker)) {
        bestTimeTracker = recentTime;
    }
    if (recentTime >= (worstTimeTracker)) {
        worstTimeTracker = recentTime;
    }
    bestTime.setText(("best time: " + (bestTimeTracker)));
    worstTime.setText(("worst time: " + (worstTimeTracker)));
}