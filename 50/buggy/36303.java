private static void giveEnchantedBox(net.minecraft.server.v1_11_R1.PlayerInventory inventory, net.minecraft.server.v1_11_R1.NBTTagCompound box) {
    inventory.setItem(inventory.getFirstEmptySlotIndex(), new net.minecraft.server.v1_11_R1.ItemStack(iieWelcomeKit.SilvShulkerBox.addEnch(box)));
}