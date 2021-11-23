@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public static void renderQuads(final int alpha, final net.minecraft.client.renderer.BufferBuilder renderer, final java.util.List<net.minecraft.client.renderer.block.model.BakedQuad> quads, final net.minecraft.block.state.IBlockState state, final net.minecraft.world.World worldObj, final net.minecraft.util.math.BlockPos blockPos) {
    for (net.minecraft.client.renderer.block.model.BakedQuad bakedquad : quads) {
        final int color = ((bakedquad.getTintIndex()) == (-1)) ? alpha | 16777215 : com.cjm721.overloaded.util.RenderUtil.getTint(alpha, bakedquad.getTintIndex(), state, worldObj, blockPos);
        net.minecraftforge.client.model.pipeline.LightUtil.renderQuadColor(renderer, bakedquad, color);
    }
}