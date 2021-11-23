@java.lang.Override
public boolean show() {
    if (shown) {
        return true;
    }
    if (!(player.isOnline())) {
        return false;
    }
    for (org.bukkit.Location loc : points) {
        if (!(dk.lockfuglsang.minecraft.animation.PlayerHandler.sendBlockChange(player, loc, material, data))) {
            return false;
        }
    }
    shown = true;
    return true;
}