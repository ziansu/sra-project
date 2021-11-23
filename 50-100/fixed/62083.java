public static java.lang.String getDurationString(long seconds) {
    long hours = seconds / 3600;
    long minutes = (seconds % 3600) / 60;
    seconds = seconds % 60;
    return ((be.b_rail.Utils.Utils.twoDigitString(hours)) + ":") + (be.b_rail.Utils.Utils.twoDigitString(minutes));
}