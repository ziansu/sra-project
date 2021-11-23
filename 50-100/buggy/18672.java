public static boolean addTimer(final java.lang.String name, final java.lang.String mode) {
    synchronized(com.sb.elsinore.LaunchControl.timerLock) {
        if ((com.sb.elsinore.LaunchControl.findTimer(name)) != null) {
            return false;
        }
        java.util.Timer tTimer = new java.util.Timer(name);
        tTimer.setMode(mode);
        com.sb.common.CollectionsUtil.addInOrder(com.sb.elsinore.LaunchControl.timerList, tTimer);
    }
    return true;
}