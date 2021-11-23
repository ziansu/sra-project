@java.lang.Override
public cpw.mods.fml.common.network.simpleimpl.IMessage onMessage(shedar.mods.ic2.nuclearcontrol.network.message.PacketServerUpdate message, cpw.mods.fml.common.network.simpleimpl.MessageContext ctx) {
    net.minecraft.item.ItemStack stack = message.itemstack;
    if ((stack != null) && ((stack.getItem()) instanceof shedar.mods.ic2.nuclearcontrol.items.ItemCardBase)) {
        shedar.mods.ic2.nuclearcontrol.panel.CardWrapperImpl helper = new shedar.mods.ic2.nuclearcontrol.panel.CardWrapperImpl(stack, 0);
        shedar.mods.ic2.nuclearcontrol.api.CardState state = ((shedar.mods.ic2.nuclearcontrol.api.IPanelDataSource) (stack.getItem())).update(ContainerRemoteMonitor.panel, helper, 100);
        shedar.mods.ic2.nuclearcontrol.utils.NCLog.error(helper.getUpdateSet());
        return new shedar.mods.ic2.nuclearcontrol.network.message.PacketClientRemoteMonitor(helper.getUpdateSet());
    }
    return null;
}