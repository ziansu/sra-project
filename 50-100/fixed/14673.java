@java.lang.Override
public void markDirty() {
    if ((itemStack) != null) {
        ((blusunrize.immersiveengineering.common.items.ItemInternalStorage) (this.itemStack.getItem())).setContainedItems(itemStack, stackList);
        if ((this.itemStack.getItem()) instanceof blusunrize.immersiveengineering.common.items.ItemUpgradeableTool)
            ((blusunrize.immersiveengineering.common.items.ItemUpgradeableTool) (this.itemStack.getItem())).recalculateUpgrades(itemStack);
        
    }
}