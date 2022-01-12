private void registerBuiltInServices(org.terracotta.passthrough.PassthroughConnection pseudoConnection) {
    org.terracotta.passthrough.PassthroughCommunicatorServiceProvider communicatorServiceProvider = new org.terracotta.passthrough.PassthroughCommunicatorServiceProvider();
    this.serverProcess.registerBuiltInServiceProvider(communicatorServiceProvider, null);
    org.terracotta.passthrough.PassthroughMessengerServiceProvider messengerServiceProvider = new org.terracotta.passthrough.PassthroughMessengerServiceProvider(pseudoConnection);
    this.serverProcess.registerBuiltInServiceProvider(messengerServiceProvider, null);
    org.terracotta.passthrough.PassthroughPlatformServiceProvider passthroughPlatformServiceProvider = new org.terracotta.passthrough.PassthroughPlatformServiceProvider(this);
    this.serverProcess.registerBuiltInServiceProvider(passthroughPlatformServiceProvider, null);
}