public static com.devebot.opflow.OpflowServerlet createServerlet(java.lang.String propFile) throws com.devebot.opflow.exception.OpflowBootstrapException {
    return com.devebot.opflow.OpflowLoader.createServerlet(OpflowServerlet.ListenerDescriptor.EMPTY, null, propFile, true);
}