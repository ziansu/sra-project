public net.minecraft.entity.item.EntityItem drop(net.minecraft.entity.Entity entity, net.minecraft.item.Item item, int meta, int amount, int chance) {
    net.minecraft.item.ItemStack stack = new net.minecraft.item.ItemStack(item, chance, meta);
    if ((stack.getCount()) > amount) {
        stack.setCount(amount);
    }
    net.minecraft.entity.item.EntityItem drop = new net.minecraft.entity.item.EntityItem(entity.getEntityWorld(), entity.posX, entity.posY, entity.posZ, stack);
    return drop;
}