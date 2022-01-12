public static void deleteTimer(final java.lang.String name) {
    synchronized(com.sb.elsinore.LaunchControl.timerLock) {
        java.util.Iterator<java.util.Timer> iterator = com.sb.elsinore.LaunchControl.timerList.iterator();
        java.util.Timer tTimer;
        while (iterator.hasNext()) {
            tTimer = iterator.next();
            if (tTimer.getName().equalsIgnoreCase(name)) {
                com.sb.elsinore.LaunchControl.timerList.remove(tTimer);
            }
        } 
    }
}