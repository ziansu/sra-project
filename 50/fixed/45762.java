private void startTimeMeasurement() {
    if (isProfilePersistence) {
        if ((startTime) == 0) {
            synchronized(this) {
                if ((startTime) == 0) {
                    startTime = java.lang.System.currentTimeMillis();
                }
            }
        }
    }
}