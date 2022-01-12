public static com.devebot.opflow.OpflowServerlet createServerlet(com.devebot.opflow.OpflowServerlet.ListenerDescriptor listeners, java.util.Map<java.lang.String, java.lang.Object> config) throws com.devebot.opflow.exception.OpflowBootstrapException {
    return com.devebot.opflow.OpflowLoader.createServerlet(listeners, config, null, false);
}