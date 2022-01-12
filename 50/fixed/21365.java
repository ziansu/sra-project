protected void RegisterEventListeners() {
    java.lang.System.out.println("Registering event listeners");
    MinecraftForge.EVENT_BUS.register(com.wuest.prefab.Proxy.CommonProxy.eventHandler);
}