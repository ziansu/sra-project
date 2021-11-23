public void setBPM(int value) {
    bpm = value;
    long period = 60000000000L / ((long) ((bpm) * 24));
    timer.setPeriod(period, java.util.concurrent.TimeUnit.NANOSECONDS);
}