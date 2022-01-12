@java.lang.Override
public net.minecraft.item.ItemStack getContainerItem(net.minecraft.item.ItemStack stack) {
    if (isDamageable()) {
        return new net.minecraft.item.ItemStack(stack.getItem(), 1, ((stack.getItemDamage()) + 1));
    }else
        if ((com.mattdahepic.mobdropexchangeorb.config.Config.orbDurability) == 1) {
            return null;
        }else {
            return stack;
        }
    
}