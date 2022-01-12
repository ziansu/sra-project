public java.lang.String generateTime(int seconds) {
    int i = seconds % 60;
    int j = (seconds / 60) % 60;
    seconds /= 3600;
    if (seconds > 0) {
        return java.lang.String.format(java.util.Locale.US, "%02d:%02d:%02d", seconds, j, i);
    }
    return java.lang.String.format(java.util.Locale.US, "%02d:%02d", j, i);
}