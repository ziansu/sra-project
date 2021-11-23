@java.lang.Override
public cpw.mods.fml.common.network.simpleimpl.IMessage onMessage(buildcraftAdditions.networking.MessageConfiguration message, cpw.mods.fml.common.network.simpleimpl.MessageContext ctx) {
    net.minecraft.tileentity.TileEntity entity = ctx.getServerHandler().playerEntity.worldObj.getTileEntity(message.x, message.y, message.z);
    if ((entity != null) && (entity instanceof buildcraftAdditions.utils.IConfigurableOutput)) {
        buildcraftAdditions.utils.IConfigurableOutput configurableOutput = ((buildcraftAdditions.utils.IConfigurableOutput) (entity));
        configurableOutput.overrideConfiguration(message.configuration);
    }
    return null;
}