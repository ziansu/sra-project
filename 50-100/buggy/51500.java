@java.lang.SuppressWarnings(value = "deprecation")
@lombok.SneakyThrows
public static boolean canRenderInLayer(@javax.annotation.Nonnull
net.minecraft.block.state.IBlockState state, @javax.annotation.Nonnull
net.minecraft.util.BlockRenderLayer layer) {
    team.chisel.common.util.ProfileUtil.start("chisel_render_in_layer");
    net.minecraft.client.renderer.block.model.IBakedModel model = net.minecraft.client.Minecraft.getMinecraft().getBlockRendererDispatcher().getModelForState(state);
    boolean ret;
    if (model instanceof team.chisel.client.render.AbstractChiselBakedModel) {
        ret = ((team.chisel.client.render.AbstractChiselBakedModel) (model)).getModel().canRenderInLayer(layer);
    }else {
        ret = state.getBlock().canRenderInLayer(layer);
    }
    team.chisel.common.util.ProfileUtil.end();
    return ret;
}