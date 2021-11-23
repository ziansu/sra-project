public void addMinutes(int newMinutes) {
    minutesSpent += newMinutes;
    if (newMinutes > 0) {
        lastUpdateTime = java.lang.System.currentTimeMillis();
    }
}