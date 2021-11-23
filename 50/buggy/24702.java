@org.bukkit.event.EventHandler
public void onShift(org.bukkit.event.player.PlayerToggleSneakEvent e) {
    if (e.getPlayer().isSneaking()) {
        return ;
    }
    if (canBend(e.getPlayer())) {
        new me.soringaming.moon.korra.earthburrow.EarthBurrow(e.getPlayer());
    }
}