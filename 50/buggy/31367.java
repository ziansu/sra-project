@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
private static void destroyTorchLight(net.minecraft.entity.Entity owner, net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos) {
    com.yooksi.fierysouls.block.BlockTorchLight.torchLightsInWorld.remove(owner);
    worldIn.setBlockToAir(pos);
}