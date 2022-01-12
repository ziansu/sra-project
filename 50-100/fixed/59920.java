@java.lang.Override
public boolean onActivate(org.bukkit.entity.Player player, java.lang.String worldName) {
    if (com.endercrest.voidspawn.ConfigManager.getInstance().isWorldSpawnSet(worldName)) {
        return com.endercrest.voidspawn.TeleportManager.getInstance().teleportSpawn(player);
    }else {
        player.sendMessage(com.endercrest.voidspawn.VoidSpawn.colorize(((com.endercrest.voidspawn.VoidSpawn.prefix) + "&cContact Admin. Mode has been set but spawn has not been.")));
        return false;
    }
}