@net.minecraftforge.fml.common.eventhandler.SubscribeEvent(priority = net.minecraftforge.fml.common.eventhandler.EventPriority.HIGH)
public void attachCapability(net.minecraftforge.event.AttachCapabilitiesEvent.TileEntity e) {
    if ((e.getTileEntity()) instanceof mcmultipart.block.TileMultipartContainer) {
        mcmultipart.block.TileMultipartContainer container = ((mcmultipart.block.TileMultipartContainer) (e.getTileEntity()));
        if (!(container.hasCapability(IngotCapabilities.CAPABILITY_INGOT, null))) {
            java.lang.System.out.println("doesn't have,adding");
            e.addCapability(new net.minecraft.util.ResourceLocation(com.primetoxinz.stacksonstacks.SoS.MODID, "ingot_capability"), new com.primetoxinz.stacksonstacks.capability.IngotCountProvider());
        }
    }
}