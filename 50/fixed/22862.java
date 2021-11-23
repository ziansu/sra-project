@org.bukkit.event.EventHandler
public void onBlockDamageSpectator(org.bukkit.event.block.BlockDamageEvent e) {
    if (isSpectating(e.getPlayer())) {
        e.setInstaBreak(true);
        e.setCancelled(true);
    }
}