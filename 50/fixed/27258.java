@java.lang.Override
public boolean onActivate(org.bukkit.entity.Player player, java.lang.String worldName) {
    return com.endercrest.voidspawn.TeleportManager.getInstance().teleportTouch(player);
}