private void registerEventListeners() {
    Polearms.logger.info("Registering event listeners");
    MinecraftForge.EVENT_BUS.register(new trueForce.polearms.EventHandler());
    MinecraftForge.EVENT_BUS.register(new trueForce.polearms.EventHandler());
}