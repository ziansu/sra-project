public static void addRecipe(com.lothrazar.samscontent.block.BlockCommandBlockCraftable block, net.minecraft.item.ItemStack flavor) {
    net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(new net.minecraft.item.ItemStack(com.lothrazar.samscontent.BlockRegistry.command_block_weather), "rcr", "cec", "rcr", 'c', Items.comparator, 'e', Items.water_bucket, 'r', Blocks.redstone_block);
    if (ModMain.cfg.uncraftGeneral)
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(BlockRegistry.command_block_weather, new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.redstone_block, 5), 0);
    
}