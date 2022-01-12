@java.lang.Override
public void renderInWorld(net.minecraft.item.ItemStack itemstack, net.minecraft.entity.EntityLivingBase entity, net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType cameraTransformType) {
    com.arisux.mdx.lib.client.render.OpenGL.disable(GL11.GL_TEXTURE_2D);
    com.arisux.mdx.lib.client.render.OpenGL.rotate((((com.arisux.mdx.lib.game.Game.minecraft().world.getWorldTime()) + ((com.arisux.mdx.lib.game.Game.partialTicks()) % 360)) * 10), 0.0F, 1.0F, 0.0F);
    com.arisux.mdx.lib.client.render.OpenGL.disable(GL11.GL_CULL_FACE);
    this.getModel().draw();
}