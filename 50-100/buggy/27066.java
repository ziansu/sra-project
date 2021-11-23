@net.minecraftforge.fml.common.Mod.EventHandler
public void init(net.minecraftforge.fml.common.event.FMLInitializationEvent event) throws java.lang.Exception {
    Content.blockSocket = moe.nightfall.vic.integratedcircuits.tile.BlockSocket.class.newInstance();
    net.minecraftforge.fml.common.registry.GameRegistry.register(Content.blockSocket.setRegistryName("socket"));
    net.minecraftforge.fml.common.registry.GameRegistry.registerTileEntity(moe.nightfall.vic.integratedcircuits.tile.TileEntitySocket.class, ((Constants.MOD_ID) + ".socket"));
    moe.nightfall.vic.integratedcircuits.IntegratedCircuits.proxy.initialize();
    net.minecraftforge.fml.common.event.FMLInterModComms.sendMessage("Waila", "register", "moe.nightfall.vic.integratedcircuits.compat.WailaAddon.registerAddon");
}