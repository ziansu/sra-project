@java.lang.Override
protected void onEnable() {
    network.setBroadcastName("BlockServer MCPE Default");
    getServer().getModule(org.blockserver.core.modules.logging.LoggingModule.class).info("PEModule enabled!");
}