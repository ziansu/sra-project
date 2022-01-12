@java.lang.Override
public boolean isItemValid(net.minecraft.item.ItemStack stack) {
    if (stack == null)
        return false;
    
    if ((inventory) instanceof com.jaquadro.minecraft.storagedrawers.inventory.InventoryUpgrade) {
        if (!(((com.jaquadro.minecraft.storagedrawers.inventory.InventoryUpgrade) (inventory)).canAddUpgrade(stack)))
            return false;
        
        if ((stack.getItem()) == (com.jaquadro.minecraft.storagedrawers.core.ModItems.upgradeOneStack))
            return ((com.jaquadro.minecraft.storagedrawers.inventory.InventoryUpgrade) (inventory)).canAddOneStackUpgrade();
        
        return true;
    }
    return false;
}