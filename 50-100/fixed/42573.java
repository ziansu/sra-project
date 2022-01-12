@java.lang.Override
public void makeHidden(org.bukkit.entity.Player player, boolean instant) {
    super.makeHidden(player, instant);
    this.velocityUpdateReceivers.remove(player);
    com.bergerkiller.bukkit.common.utils.PacketUtil.sendPacket(player, PacketType.OUT_ENTITY_VELOCITY.newInstance(getEntity().getEntityId(), com.bergerkiller.bukkit.tc.controller.MinecartMemberNetwork.ZERO_VELOCITY));
    org.bukkit.entity.Entity entity = this.getUpsideDownEntity();
    if (entity != null) {
        sendUpsideDownUnmount(player, entity);
    }
}