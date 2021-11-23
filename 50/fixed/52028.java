@java.lang.Override
public void preInit() {
    net.minecraftforge.fml.common.registry.GameRegistry.registerBlock(this, org.squiddev.cctweaks.items.ItemMultiBlock.class, name);
    registerTileEntity(org.squiddev.cctweaks.blocks.debug.TileDebugPeripheral.class, "debugPeripheral");
    registerTileEntity(org.squiddev.cctweaks.blocks.debug.TileDebugNetworkedPeripheral.class, "debugNetworkedPeripheral");
    registerTileEntity(org.squiddev.cctweaks.blocks.debug.TileDebugNode.class, "debugNode");
}