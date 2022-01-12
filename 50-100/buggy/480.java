@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public static void registerBlocks(net.minecraftforge.event.RegistryEvent.Register<net.minecraft.block.Block> event) {
    BaseMetals.logger.fatal("BLOCK REGISTER!");
    for (com.mcmoddev.lib.material.MMDMaterial mat : com.mcmoddev.lib.init.Materials.getMaterialsByMod(BaseMetals.MODID)) {
        for (net.minecraft.block.Block block : mat.getBlocks()) {
            if (block.getRegistryName().getResourceDomain().equals(BaseMetals.MODID)) {
                event.getRegistry().register(block);
            }
        }
    }
    if ((com.mcmoddev.basemetals.init.Blocks.humanDetector) != null) {
        event.getRegistry().register(com.mcmoddev.basemetals.init.Blocks.humanDetector);
    }
}