public void update(long sysTime) {
    if (currentTimer.isRunning()) {
        currentTimer.update(sysTime);
    }
    hacks.coachs_timer.Time t = currentTimer.getTime();
    hacks.coachs_timer.Time s = currentTimer.getSplit();
    totalTime.setText(t.timeString());
    totalMilli.setText(t.milString());
    splitTime.setText(s.timeString());
    splitMilli.setText(s.milString());
}