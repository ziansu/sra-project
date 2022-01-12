protected void handleContainerClick(net.minecraft.world.World worldIn, net.minecraft.util.BlockPos pos, net.minecraft.entity.player.EntityPlayer playerIn, com.nik7.upgcraft.tileentities.UpgCtileentityFluidTank tank, net.minecraft.item.ItemStack equippedItemStack) {
    if (net.minecraftforge.fluids.FluidContainerRegistry.isBucket(equippedItemStack)) {
        if (net.minecraftforge.fluids.FluidContainerRegistry.isEmptyContainer(equippedItemStack)) {
            fillBucketFromTank(worldIn, pos, playerIn, tank, equippedItemStack);
        }else {
            drainBucketIntoTank(playerIn, tank, equippedItemStack);
        }
    }
}