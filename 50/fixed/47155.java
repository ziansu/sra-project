public static void addPID(final com.sb.elsinore.PID newPID) {
    com.sb.elsinore.LaunchControl.pidList.add(newPID);
    java.lang.Thread pThread = new java.lang.Thread(newPID);
    pThread.start();
    com.sb.elsinore.LaunchControl.pidThreads.add(pThread);
}