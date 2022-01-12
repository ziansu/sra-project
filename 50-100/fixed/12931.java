public static boolean isInvEmpty(net.minecraft.inventory.IInventory stack) {
    boolean empty = true;
    if (stack == null)
        return true;
    
    for (int i = 0; i < (stack.getSizeInventory()); i++) {
        if (!(stack.getStackInSlot(i).isEmpty()))
            return false;
        
    }
    return true;
}