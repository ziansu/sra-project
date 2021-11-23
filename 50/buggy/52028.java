@java.lang.Override
public void preInit() {
    net.minecraftforge.fml.common.registry.GameRegistry.registerBlock(this, org.squiddev.cctweaks.items.ItemMultiBlock.class, name);
    net.minecraftforge.fml.common.registry.GameRegistry.registerTileEntity(org.squiddev.cctweaks.blocks.debug.TileDebugPeripheral.class, "debugPeripheral");
    net.minecraftforge.fml.common.registry.GameRegistry.registerTileEntity(org.squiddev.cctweaks.blocks.debug.TileDebugNetworkedPeripheral.class, "debugNetworkedPeripheral");
    net.minecraftforge.fml.common.registry.GameRegistry.registerTileEntity(org.squiddev.cctweaks.blocks.debug.TileDebugNode.class, "debugNode");
}