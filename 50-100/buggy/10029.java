private void renderTime(final long milliseconds) {
    final long seconds = (milliseconds / 1000) % 60;
    final long minute = (milliseconds / 60000) % 60;
    final long hour = (milliseconds / 3600000) % 24;
    final long day = milliseconds / 86400000;
    final java.lang.String text = java.lang.String.format(mTimeFormat, day, hour, minute, seconds);
    setText(text);
}