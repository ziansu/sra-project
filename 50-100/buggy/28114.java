public void connect() {
    try {
        reset();
        jch.connect(clusterName);
    } catch (java.lang.Exception e) {
        for (net.voidfunction.rm.common.jgroups.JGroupsListener listener : listeners) {
            listener.onError(((("Could not connect: " + (e.getClass().getName())) + " - ") + (e.getMessage())));
            listener.onDisconnect();
            reset();
        }
    }
}