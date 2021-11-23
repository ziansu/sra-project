public void setLine(java.lang.String line) {
    final java.lang.String RED_LINE = "red_line";
    final java.lang.String GREEN_LINE = "green_line";
    this.line = line;
    int resArrayStops = 0;
    switch (line) {
        case RED_LINE :
            resArrayStops = R.array.array_stops_redline;
            break;
        case GREEN_LINE :
            resArrayStops = R.array.array_stops_greenline;
            break;
        default :
            android.util.Log.wtf(LOG_TAG, "Invalid line specified.");
    }
    initAdapterStops(resArrayStops);
}