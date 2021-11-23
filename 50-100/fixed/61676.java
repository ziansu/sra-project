@java.lang.Override
public void onBlockPlacedBy(net.minecraft.world.World world, int x, int y, int z, net.minecraft.entity.EntityLivingBase placer, net.minecraft.item.ItemStack stack) {
    int l = net.minecraft.block.BlockPistonBase.determineOrientation(world, x, y, z, placer);
    java.lang.System.out.println(l);
    world.setBlockMetadataWithNotify(x, y, z, l, 2);
}