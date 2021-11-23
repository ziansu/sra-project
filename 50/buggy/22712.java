private static void killOnExit(final java.lang.Process p) {
    org.apache.openejb.config.RemoteServer.kill.add(p);
}