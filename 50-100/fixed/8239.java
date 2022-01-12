@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
private static int getTint(final int alpha, final int tintIndex, final net.minecraft.block.state.IBlockState state, final net.minecraft.world.World worldObj, final net.minecraft.util.math.BlockPos blockPos) {
    return alpha | (net.minecraft.client.Minecraft.getMinecraft().getBlockColors().colorMultiplier(state, worldObj, blockPos, tintIndex));
}