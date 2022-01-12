@java.lang.Override
public minetweaker.mc1112.item.IItemStack withDamage(int damage) {
    minetweaker.mc1112.item.ItemStack result = new minetweaker.mc1112.item.ItemStack(stack.getItem(), stack.getCount(), damage);
    result.setTagCompound(stack.getTagCompound());
    return new minetweaker.mc1112.item.MCItemStack(result, tag);
}