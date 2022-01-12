public void newDay() {
    long timestampDay = java.util.concurrent.TimeUnit.MILLISECONDS.toDays(new java.util.Date().getTime());
    if (timestampDay > (today)) {
        temperaturSeries.getData().clear();
        helligkeitSeries.getData().clear();
        luftdruckSeries.getData().clear();
        luftfeuchtigkeitSeries.getData().clear();
    }
}