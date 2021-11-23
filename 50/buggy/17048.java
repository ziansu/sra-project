@java.lang.Override
public net.minecraftforge.fml.common.network.simpleimpl.IMessage onMessage(com.minecolonies.network.messages.ColonyViewWorkOrderMessage message, net.minecraftforge.fml.common.network.simpleimpl.MessageContext ctx) {
    return com.minecolonies.colony.ColonyManager.handleColonyViewWorkOrderMessage(message.colonyId, message.workOrderBuffer, message.order);
}