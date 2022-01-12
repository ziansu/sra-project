@java.lang.Override
public boolean canSlotAccept(int slotIndex, net.minecraft.item.ItemStack itemStack) {
    if (slotIndex == (inputSlot)) {
        return ForestryItem.beverage.isItemEqual(itemStack);
    }else
        if ((slotIndex >= (ingredientSlot1)) && (slotIndex < ((ingredientSlot1) + (ingredientSlotCount)))) {
            return BeverageManager.infuserManager.isIngredient(itemStack);
        }
    
    return false;
}