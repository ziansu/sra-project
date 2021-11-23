public static java.lang.String minutesToString(long minutes) {
    if (minutes < 60)
        return java.lang.String.format("%d minutes");
    
    long hours = minutes / 60;
    return net.eithon.library.time.TimeMisc.hoursToString(hours, (minutes - (hours * 60)));
}