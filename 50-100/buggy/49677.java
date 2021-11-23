@java.lang.Override
public void setSkin(java.lang.String url) {
    checkUrl(url);
    skin = url;
    for (org.bukkit.entity.Player p : getWorld().getPlayers()) {
        ((org.getspout.spoutapi.player.SpoutPlayer) (p)).sendPacket(new org.getspout.spoutapi.packet.PacketSkinURL(getEntityId(), getSkin(((org.getspout.spoutapi.player.SpoutPlayer) (p)))));
    }
}