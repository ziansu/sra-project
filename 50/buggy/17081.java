public void clear(java.lang.String timerName) {
    if (timers.containsKey(timerName)) {
        timers.get(timerName).clear();
    }
}