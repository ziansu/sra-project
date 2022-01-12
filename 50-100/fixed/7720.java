@java.lang.Override
public net.minecraftforge.fml.common.network.simpleimpl.IMessage onMessage(gr8pefish.ironbackpacks.network.client.ClientEquippedPackMessage message, net.minecraftforge.fml.common.network.simpleimpl.MessageContext ctx) {
    net.minecraft.client.Minecraft.getMinecraft().addScheduledTask(() -> {
        net.minecraft.entity.player.EntityPlayer player = IronBackpacks.proxy.getClientPlayer();
        if (player != null) {
            gr8pefish.ironbackpacks.capabilities.player.PlayerWearingBackpackCapabilities.setEquippedBackpack(player, message.stack);
            gr8pefish.ironbackpacks.capabilities.player.PlayerDeathBackpackCapabilities.setEquippedBackpack(player, null);
        }
    });
    return null;
}