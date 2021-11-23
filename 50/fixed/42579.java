public final boolean setAdmin(final net.minecraft.entity.player.EntityPlayer player) {
    if ((players.get(0)) == null) {
        players.set(0, player);
        return true;
    }
    return false;
}