public static void createItems() {
    net.minecraftforge.fml.common.registry.GameRegistry.registerItem(new com.mc_Dandy.winx.items.ItemElytra().setUnlocalizedName("elytra"), "elytra");
    net.minecraftforge.fml.common.registry.GameRegistry.addShapelessRecipe(new net.minecraft.item.ItemStack(com.mc_Dandy.winx.items.ModItems3.fp), new java.lang.Object[]{ com.mc_Dandy.fantasyCore.items.ModItems.Magic_Powder , net.minecraft.init.Items.glowstone_dust , new net.minecraft.item.ItemStack(net.minecraft.init.Items.dye, 1, 4) });
}