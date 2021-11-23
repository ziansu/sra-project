private static synchronized com.squareup.otto.Bus bus() {
    if ((pt.lsts.accl.bus.AcclBus.busInstance) == null) {
        try {
            java.lang.Class.forName("android.os.Looper");
            pt.lsts.accl.bus.AcclBus.busInstance = new com.squareup.otto.Bus("accl");
        } catch (java.lang.Exception e) {
            pt.lsts.accl.bus.AcclBus.busInstance = new com.squareup.otto.Bus(com.squareup.otto.ThreadEnforcer.ANY, "accl");
            java.lang.System.err.println("WARNING: Running in a desktop environment");
        }
    }
    return pt.lsts.accl.bus.AcclBus.busInstance;
}