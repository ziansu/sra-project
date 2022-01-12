@java.lang.Override
public void postInit(org.bukkit.plugin.Plugin plugin, org.bukkit.Location location) throws java.lang.Exception {
    new org.inventivetalent.reflection.resolver.FieldResolver(Reflection.nmsClassResolver.resolve("EntityPlayer")).resolve("playerConnection").set(getNpcEntity(), org.inventivetalent.npclib.ClassBuilder.buildPlayerConnection(org.inventivetalent.npclib.ClassBuilder.buildNetworkManager(false), getNpcEntity()));
    getBukkitEntity().setGameMode(GameMode.SURVIVAL);
    for (org.bukkit.entity.Player player : org.bukkit.Bukkit.getOnlinePlayers()) {
        updatePlayerList(player);
    }
    super.postInit(plugin, location);
}