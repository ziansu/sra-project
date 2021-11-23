@org.bukkit.event.EventHandler
public void onBlockDamageSpectator(org.bukkit.event.block.BlockDamageEvent e) {
    if (com.thebubblenetwork.api.game.GameListener.isSpectating(e.getPlayer())) {
        e.setInstaBreak(true);
        e.setCancelled(true);
    }
}