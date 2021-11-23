public static void mergeItemsBetweenStacks(net.minecraft.item.ItemStack takeFrom, net.minecraft.item.ItemStack moveTo) {
    int room = (moveTo.getMaxStackSize()) - (moveTo.stackSize);
    if (room > 0) {
        int moveover = java.lang.Math.min(takeFrom.stackSize, room);
        moveTo.stackSize += moveover;
        takeFrom.stackSize -= moveover;
    }
}