public static void checkStatus(java.nio.IntBuffer status) {
    int s = status.get(0);
    if (s < 0) {
        java.lang.String message = io.github.robolib.hal.HALUtil.getHALErrorMessage(s);
        throw new java.lang.RuntimeException((((" Code: " + s) + ". ") + message));
    }else
        if (s > 0) {
            io.github.robolib.util.log.Logger.get(io.github.robolib.hal.HALUtil.class).warn(io.github.robolib.hal.HALUtil.getHALErrorMessage(s));
        }
    
}