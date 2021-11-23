public static void sortDevices() {
    synchronized(com.sb.elsinore.LaunchControl.timerLock) {
        java.util.Collections.sort(com.sb.elsinore.LaunchControl.tempList);
    }
}