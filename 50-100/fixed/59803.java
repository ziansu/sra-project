public static java.lang.Object registerDefault(java.lang.String name) {
    try {
        java.lang.Class<?> signalHandlerClass = java.lang.Class.forName("sun.misc.SignalHandler");
        return org.jline.utils.Signals.doRegister(name, signalHandlerClass.getField("SIG_DFL").get(null));
    } catch (java.lang.Exception e) {
        return null;
    }
}