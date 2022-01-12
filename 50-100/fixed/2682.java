public static boolean mergeItemsBetweenStacks(net.minecraft.item.ItemStack takeFrom, net.minecraft.item.ItemStack moveTo) {
    int room = (moveTo.getMaxStackSize()) - (moveTo.stackSize);
    int moveover = 0;
    if (room > 0) {
        moveover = java.lang.Math.min(takeFrom.stackSize, room);
        moveTo.stackSize += moveover;
        takeFrom.stackSize -= moveover;
    }
    return moveover > 0;
}