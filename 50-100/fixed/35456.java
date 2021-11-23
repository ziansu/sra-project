public static java.util.Timer findTimer(final java.lang.String name) {
    java.util.Iterator<java.util.Timer> iterator = com.sb.elsinore.LaunchControl.timerList.iterator();
    java.util.Timer tTimer;
    while (iterator.hasNext()) {
        tTimer = iterator.next();
        if (tTimer.getName().equalsIgnoreCase(name)) {
            return tTimer;
        }
    } 
    return null;
}