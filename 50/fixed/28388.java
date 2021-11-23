public void addBucket(net.minecraft.entity.player.EntityPlayer entityPlayer, net.minecraft.world.World world, com.lothrazar.samscontent.block.TileEntityBucketStorage storage) {
    storage.addBucket();
    int b = storage.getBuckets();
    entityPlayer.destroyCurrentEquippedItem();
}