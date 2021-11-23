private boolean isPlayerActive(net.minecraft.entity.player.EntityPlayer player) {
    if (player != null) {
        for (advancedsystemsmanager.util.UserPermission permission : permissions) {
            if (permission.getUser().equals(player.getGameProfile())) {
                return permission.isActive();
            }
        }
    }
    return false;
}