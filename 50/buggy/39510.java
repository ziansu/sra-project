private void start() {
    if (micPresent) {
        soundManager.start();
        long todayMillis = getTodayMillis();
        if ((soundlevel) == null) {
            soundlevel = dataSource.getSoundLevel(todayMillis);
        }
    }
}