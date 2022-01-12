@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void onRenderPlayer(net.minecraftforge.client.event.RenderPlayerEvent.Post event) {
    net.minecraft.entity.player.EntityPlayer player = event.entityPlayer;
    fiskfille.tf.common.transformer.base.Transformer transformer = fiskfille.tf.helper.TFHelper.getTransformer(player);
    boolean isClientPlayer = (mc.thePlayer) == player;
    if (transformer != null) {
        if (isClientPlayer && ((transformer.getCameraYOffset(player)) != 0.0F)) {
            org.lwjgl.opengl.GL11.glPopMatrix();
        }
    }
}