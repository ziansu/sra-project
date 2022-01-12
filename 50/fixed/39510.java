private void start() {
    if (micPresent) {
        long todayMillis = getTodayMillis();
        if ((soundlevel) == null) {
            soundlevel = dataSource.getSoundLevel(todayMillis);
        }
    }
}