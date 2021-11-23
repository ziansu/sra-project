@java.lang.Override
public void preInit() {
    net.minecraftforge.fml.common.registry.GameRegistry.registerBlock(this, org.squiddev.cctweaks.items.ItemMultiBlock.class, name);
    net.minecraftforge.fml.common.registry.GameRegistry.registerTileEntity(org.squiddev.cctweaks.blocks.network.TileNetworkedWirelessBridge.class, "wirelessBridge");
    net.minecraftforge.fml.common.registry.GameRegistry.registerTileEntity(org.squiddev.cctweaks.blocks.network.TileNetworkedModem.class, "wiredModem");
}