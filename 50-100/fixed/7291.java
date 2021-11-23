public java.lang.String getFormattedDuration() {
    int seconds = ((int) (((mDuration) / 1000) % 60));
    int minutes = ((int) (((mDuration) / (1000 * 60)) % 60));
    int hours = ((int) (((mDuration) / ((1000 * 60) * 60)) % 24));
    return java.lang.String.format("%02d:%02d:%02d", hours, minutes, seconds);
}