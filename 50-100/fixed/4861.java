public static void giveItem(net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer player, net.minecraft.util.BlockPos pos, net.minecraft.item.ItemStack oldStack) {
    if (!(player.inventory.addItemStackToInventory(oldStack))) {
        net.minecraft.entity.item.EntityItem entityItem = new net.minecraft.entity.item.EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), oldStack);
        world.spawnEntityInWorld(entityItem);
    }
}