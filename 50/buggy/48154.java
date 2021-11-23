public static com.devebot.opflow.OpflowServerlet createServerlet() throws com.devebot.opflow.exception.OpflowBootstrapException {
    return com.devebot.opflow.OpflowLoader.createServerlet(null, null, true, OpflowServerlet.ListenerDescriptor.EMPTY);
}