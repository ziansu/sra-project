@java.lang.SuppressWarnings(value = "unused")
public static void renderModel(net.minecraft.client.model.ModelBiped model, net.minecraft.entity.Entity entity, float limbSwing, float limbSwingAmount, float rotation, float rotationYaw, float rotationPitch, float scale) {
    MinecraftForge.EVENT_BUS.post(new net.ilexiconn.llibrary.client.event.PlayerModelEvent.Render(model, ((net.minecraft.entity.player.EntityPlayer) (entity)), limbSwing, limbSwingAmount, rotation, rotationYaw, rotationPitch, scale));
}