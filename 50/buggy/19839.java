public static void deleteTemp(com.sb.elsinore.Temp tTemp) {
    tTemp.shutdown();
    synchronized(com.sb.elsinore.LaunchControl.timerLock) {
        com.sb.elsinore.LaunchControl.tempList.remove(tTemp);
    }
}