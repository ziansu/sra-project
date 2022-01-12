public static void register(net.minecraft.block.Block block) {
    if (Config.debug)
        java.lang.System.out.println(("Registered " + (block.getRegistryName())));
    
    net.minecraftforge.fml.common.registry.GameRegistry.register(block);
    if ((!(shadows.plants.util.Util.isException(block))) && (!(block instanceof shadows.plants.block.internal.cosmetic.BlockDoubleHarvestable)))
        net.minecraftforge.fml.common.registry.GameRegistry.register(new net.minecraft.item.ItemBlock(block), block.getRegistryName());
    
}