public void registerHandlers() {
    cpw.mods.fml.common.FMLCommonHandler.instance().bus().register(new bq_rf.client.gui.UpdateNotification());
    BQRF.instance.network.registerMessage(PacketRf.HandlerServer.class, bq_rf.network.PacketRf.class, 1, Side.SERVER);
    NetworkRegistry.INSTANCE.registerGuiHandler(BQRF.instance, new bq_rf.handlers.GuiHandler());
}