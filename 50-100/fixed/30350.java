@java.lang.Override
public void handleClientMessage(net.darkhax.bookshelf.common.network.packet.PacketAddPlayerProperties message, net.minecraft.entity.player.EntityPlayer player) {
    if ((player != null) && ((player.worldObj) != null)) {
        net.minecraft.entity.Entity entity = player.worldObj.getEntityByID(message.entityId);
        if ((entity != null) && (entity instanceof net.minecraft.entity.EntityLivingBase))
            net.darkhax.bookshelf.common.EntityProperties.getProperties(((net.minecraft.entity.EntityLivingBase) (entity))).add(message.buffs, true);
        
    }
}