@java.lang.Override
public void postInit(net.minecraftforge.fml.common.event.FMLPostInitializationEvent event) {
    super.postInit(event);
    net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer.instance = new reborncore.shields.client.RebornItemStackRenderer();
}