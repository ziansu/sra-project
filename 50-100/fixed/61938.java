public static void addChatShapelessRecipe(net.minecraft.entity.player.EntityPlayer player, net.minecraft.item.ItemStack[] recipeItems) {
    for (int i = 0; i < (recipeItems.length); i++) {
        net.minecraft.item.ItemStack is = recipeItems[i];
        com.lothrazar.util.Util.addChatMessage(player, (" - " + (is.getDisplayName())));
    }
}