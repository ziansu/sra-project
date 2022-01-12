public static int tryCharge(net.minecraft.item.ItemStack stack, int amt, boolean simulate) {
    if ((stack.getItem()) instanceof ic2.api.item.IElectricItem) {
        ic2.api.item.IElectricItem iei = ((ic2.api.item.IElectricItem) (stack.getItem()));
        ic2.api.item.IElectricItemManager manager = (iei instanceof ic2.api.item.ISpecialElectricItem) ? ((ic2.api.item.ISpecialElectricItem) (iei)).getManager(stack) : ic2.api.item.ElectricItem.manager;
        if (manager == null)
            return 0;
        
        return manager.charge(stack, amt, 3, true, simulate);
    }
    return 0;
}