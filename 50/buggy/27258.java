@java.lang.Override
public boolean onActivate(org.bukkit.entity.Player player, java.lang.String worldName) {
    com.endercrest.voidspawn.TeleportManager.getInstance().teleportTouch(player);
    return false;
}