public static void handle(org.bukkit.entity.Player player) {
    ((org.bukkit.craftbukkit.v1_9_R2.entity.CraftPlayer) (player)).getHandle().playerConnection.networkManager.channel.pipeline().addBefore("packet-handler", "replicate", new org.kubithon.replicate.netty.ReplicationChannelHandler());
}