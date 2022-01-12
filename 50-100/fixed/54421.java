@java.lang.Override
public boolean isItemValid(@javax.annotation.Nonnull
net.minecraft.item.ItemStack stack) {
    if (stack.isEmpty())
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