private boolean removeFromStack(com.esbjon.inventories.Tracker tracker, boolean keepStackSlot, boolean freeItem, boolean vanish) {
    com.esbjon.UI.BarSlotStack stackSlot = this.obtainStackSlot(tracker);
    if (stackSlot == null)
        return false;
    else
        if (stackSlot.contains(tracker)) {
            stackSlot.removeItem(freeItem, true, vanish);
            if ((stackSlot.isEmpty()) && (!keepStackSlot)) {
                this.removeSlot(stackSlot, freeItem);
            }
            return true;
        }else
            return false;
        
    
}