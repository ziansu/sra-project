@java.lang.Override
public void run() {
    if (((player.getWorld()) != (location.getWorld())) || ((player.getLocation().distance(location)) > 2)) {
        io.github.dre2n.commons.util.playerutil.PlayerUtil.secureTeleport(player, location);
    }
    io.github.dre2n.dungeonsxl.player.DGlobalPlayer dPlayer = io.github.dre2n.dungeonsxl.DungeonsXL.getInstance().getDPlayers().getByPlayer(player);
    if (dPlayer == null) {
        return ;
    }
    dPlayer.applyRespawnInventory();
}