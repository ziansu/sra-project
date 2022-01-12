public static void giveItem(net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer player, net.minecraft.block.Block block, int meta, int cnt, net.minecraft.util.BlockPos pos) {
    net.minecraft.item.ItemStack oldStack = new net.minecraft.item.ItemStack(block, cnt, meta);
    if (!(player.inventory.addItemStackToInventory(oldStack))) {
        net.minecraft.entity.item.EntityItem entityItem = new net.minecraft.entity.item.EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), oldStack);
        world.spawnEntityInWorld(entityItem);
    }
}