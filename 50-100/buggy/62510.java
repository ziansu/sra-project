@java.lang.Override
public minetweaker.mc1112.item.IItemStack withDamage(int damage) {
    if (stack.getItem().getHasSubtypes()) {
        minetweaker.MineTweakerAPI.logWarning("subitems don't have damaged states");
        return this;
    }else {
        minetweaker.mc1112.item.ItemStack result = new minetweaker.mc1112.item.ItemStack(stack.getItem(), stack.getCount(), damage);
        result.setTagCompound(stack.getTagCompound());
        return new minetweaker.mc1112.item.MCItemStack(result, tag);
    }
}