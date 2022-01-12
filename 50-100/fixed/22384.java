private java.lang.String timeFormatter(double timeVal) {
    java.lang.String timeStr = "seconds";
    if (timeVal >= 60.0) {
        timeVal = timeVal / 60.0;
        timeStr = "minutes";
        if (timeVal >= 60.0) {
            timeVal = timeVal / 60.0;
            timeStr = "hours";
            if (timeVal >= 24.0) {
                timeVal = timeVal / 24.0;
                timeStr = "days";
            }
        }
    }
    return (timeVal + " ") + timeStr;
}