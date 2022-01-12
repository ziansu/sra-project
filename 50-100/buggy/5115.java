@java.lang.Override
public void initialize() {
    logger.debug("Initializing innogy SmartHome BridgeHandler...");
    in.ollie.innogysmarthome.Configuration config = loadAndCheckConfig();
    if (config != null) {
        logger.debug(config.toString());
        org.openhab.binding.innogysmarthome.handler.InnogyBridgeHandler.Initializer i = new org.openhab.binding.innogysmarthome.handler.InnogyBridgeHandler.Initializer(this, config);
        i.run();
    }
}