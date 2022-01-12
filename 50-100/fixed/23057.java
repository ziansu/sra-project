public static boolean hasArmorSetPiece(net.minecraft.entity.player.EntityPlayer player, int i) {
    net.minecraft.item.ItemStack stack = player.inventory.armorInventory.get((3 - i));
    switch (i) {
        case 0 :
            return (stack.getItem()) == (com.girafi.culinarycultivation.init.ModItems.FARMER_STRAWHAT);
        case 1 :
            return (stack.getItem()) == (com.girafi.culinarycultivation.init.ModItems.FARMER_SHIRT);
        case 2 :
            return (stack.getItem()) == (com.girafi.culinarycultivation.init.ModItems.FARMER_OVERALLS);
        case 3 :
            return (stack.getItem()) == (com.girafi.culinarycultivation.init.ModItems.FARMER_BOOTS);
    }
    return false;
}