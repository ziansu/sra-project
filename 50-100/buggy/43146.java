@java.lang.Override
public cpw.mods.fml.common.network.simpleimpl.IMessage onMessage(radixcore.packets.PacketDataSyncReq packet, cpw.mods.fml.common.network.simpleimpl.MessageContext context) {
    try {
        radixcore.data.IWatchable watchable = ((radixcore.data.IWatchable) (context.getServerHandler().playerEntity.worldObj.getEntityByID(packet.entityId)));
        radixcore.data.DataWatcherEx dataWatcherEx = watchable.getDataWatcherEx();
        return new radixcore.packets.PacketDataSync(packet.entityId, dataWatcherEx);
    } catch (java.lang.Throwable e) {
        radixcore.util.RadixExcept.logErrorCatch(e, "Error sending sync data to client.");
    }
    return null;
}