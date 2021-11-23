public static com.sb.elsinore.PID findPID(final java.lang.String name) {
    synchronized(com.sb.elsinore.LaunchControl.pidList) {
        java.util.Iterator<com.sb.elsinore.PID> iterator = com.sb.elsinore.LaunchControl.pidList.iterator();
        com.sb.elsinore.PID tPid;
        while (iterator.hasNext()) {
            tPid = iterator.next();
            if ((tPid.getName().equalsIgnoreCase(name)) || (tPid.getTempProbe().getProbe().equalsIgnoreCase(name))) {
                return tPid;
            }
        } 
    }
    return null;
}