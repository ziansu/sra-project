public static void addRecipe(com.lothrazar.samscontent.block.BlockCommandBlockCraftable block, net.minecraft.item.ItemStack flavor) {
    net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(new net.minecraft.item.ItemStack(block), "rcr", "cec", "rcr", 'c', Items.comparator, 'e', flavor, 'r', Blocks.redstone_block);
    if (ModMain.cfg.uncraftGeneral)
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(block, new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.redstone_block, 5), 0);
    
}