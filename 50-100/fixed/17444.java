@net.minecraftforge.fml.common.Mod.EventHandler
public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
    NetworkRegistry.INSTANCE.registerGuiHandler(org.nationsatwar.babble.Babble.instance, new org.nationsatwar.babble.gui.GUIHandler());
    org.nationsatwar.babble.Babble.receiveChannel = NetworkRegistry.INSTANCE.newSimpleChannel(org.nationsatwar.babble.Babble.MODID);
    org.nationsatwar.babble.Babble.receiveChannel.registerMessage(org.nationsatwar.babble.packets.PacketHandlerReceiveChannel.class, org.nationsatwar.babble.packets.PacketChannel.class, 1, Side.CLIENT);
    org.nationsatwar.babble.Babble.sendChannel = NetworkRegistry.INSTANCE.newSimpleChannel(org.nationsatwar.babble.Babble.MODID);
    org.nationsatwar.babble.Babble.sendChannel.registerMessage(org.nationsatwar.babble.packets.PacketHandlerSendChannel.class, org.nationsatwar.babble.packets.PacketChannel.class, 1, Side.SERVER);
    org.nationsatwar.babble.Babble.proxy.registerKeybindings();
    org.nationsatwar.babble.Babble.proxy.registerGuiEvents();
    net.minecraftforge.fml.common.FMLCommonHandler.instance().bus().register(new org.nationsatwar.babble.events.KeyEvents());
}