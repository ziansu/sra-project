@java.lang.Override
public boolean onActivate(org.bukkit.entity.Player player, java.lang.String worldName) {
    if (com.endercrest.voidspawn.ConfigManager.getInstance().isWorldSpawnSet(worldName)) {
        com.endercrest.voidspawn.TeleportManager.getInstance().teleportSpawn(player);
        return true;
    }else {
        player.sendMessage(com.endercrest.voidspawn.VoidSpawn.colorize(((com.endercrest.voidspawn.VoidSpawn.prefix) + "&cContact Admin. Mode has been set but spawn has not been.")));
        return false;
    }
}