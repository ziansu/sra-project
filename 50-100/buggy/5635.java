private static java.lang.String durationToString(org.joda.time.Duration duration) {
    java.lang.String durationString = (duration.getStandardSeconds()) + "s";
    if ((duration.getStandardMinutes()) > 0) {
        durationString = (((duration.getStandardMinutes()) % 60) + "m ") + durationString;
        if ((duration.getStandardHours()) > 0) {
            durationString = ((duration.getStandardHours()) + "h ") + durationString;
        }
    }
    return durationString;
}