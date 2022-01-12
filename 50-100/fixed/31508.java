public void addRecipe() {
    net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(new net.minecraft.item.ItemStack(com.lothrazar.samscontent.ItemRegistry.apple_ghost, 8), "aaa", "aga", "aaa", 'g', Items.ghast_tear, 'a', Items.apple);
    net.minecraftforge.fml.common.registry.GameRegistry.addRecipe(new net.minecraft.item.ItemStack(com.lothrazar.samscontent.ItemRegistry.apple_ghost), "lll", "lal", "lll", 'l', Items.bone, 'a', Items.apple);
    if (ModMain.cfg.uncraftGeneral)
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(ItemRegistry.apple_ghost, new net.minecraft.item.ItemStack(net.minecraft.init.Items.bone, 8), 0);
    
}