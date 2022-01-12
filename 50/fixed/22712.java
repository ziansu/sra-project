private static void killOnExit(final java.lang.Process p) {
    synchronized(org.apache.openejb.config.RemoteServer.kill) {
        org.apache.openejb.config.RemoteServer.kill.add(p);
    }
}