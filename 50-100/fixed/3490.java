public static void despawn(net.dzikoysk.funnyguilds.basic.Guild guild, org.bukkit.entity.Player... players) {
    try {
        int id = net.dzikoysk.funnyguilds.util.reflect.EntityUtil.entitesMap.get(guild);
        java.lang.Object o = net.dzikoysk.funnyguilds.util.reflect.EntityUtil.despawnPacket(id);
        net.dzikoysk.funnyguilds.util.reflect.PacketSender.sendPacket(players, o);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}