public static void saveInventoryFields(net.minecraft.inventory.IInventory inventory, net.minecraft.inventory.IInventory tileEntity) {
    for (int i = 0; i < (inventory.getFieldCount()); i++) {
        tileEntity.setField(i, inventory.getField(i));
    }
}