public static void addChatShapelessRecipe(net.minecraft.entity.player.EntityPlayer player, java.util.ArrayList<net.minecraft.item.ItemStack> recipeItems) {
    for (int i = 0; i < (recipeItems.size()); i++) {
        net.minecraft.item.ItemStack is = recipeItems.get(i);
        com.lothrazar.util.Util.addChatMessage(player, (" - " + (is.getDisplayName())));
    }
}