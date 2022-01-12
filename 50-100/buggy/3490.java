public static void despawn(org.bukkit.entity.Player... players) {
    for (net.dzikoysk.funnyguilds.basic.Guild guild : net.dzikoysk.funnyguilds.basic.util.GuildUtils.getGuilds()) {
        try {
            int id = net.dzikoysk.funnyguilds.util.reflect.EntityUtil.entitesMap.get(guild);
            net.dzikoysk.funnyguilds.util.reflect.EntityUtil.ids.remove(id);
            net.dzikoysk.funnyguilds.util.reflect.EntityUtil.entitesMap.remove(guild);
            java.lang.Object o = net.dzikoysk.funnyguilds.util.reflect.EntityUtil.despawnPacket(id);
            net.dzikoysk.funnyguilds.util.reflect.PacketSender.sendPacket(players, o);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}