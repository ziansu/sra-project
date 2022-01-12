@java.lang.Override
public cpw.mods.fml.common.network.simpleimpl.IMessage onMessage(obsidianAPI.network.PacketAnimationStart message, cpw.mods.fml.common.network.simpleimpl.MessageContext ctx) {
    net.minecraft.entity.Entity entity = net.minecraft.client.Minecraft.getMinecraft().theWorld.getEntityByID(message.entityID);
    obsidianAPI.render.ModelAnimated model = ((obsidianAPI.render.RenderAnimated) (RenderManager.instance.getEntityRenderObject(entity))).getModel();
    obsidianAPI.EntityAnimationPropertiesClient.get(entity).setActiveAnimation(model, message.animationName, message.animationStartTime, message.loopAnim, message.transitionTime);
    return null;
}