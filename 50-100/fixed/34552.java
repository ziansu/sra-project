@org.bukkit.event.EventHandler
public void onBlockBreak(net.simplycrafted.StickyProtection.BlockBreakEvent event) {
    if (event.isCancelled()) {
        return ;
    }
    if (checkProtection(event.getBlock(), event.getPlayer())) {
        if (((event.getPlayer()) != null) && (!(event.getPlayer().hasPermission("stickylocks.ghost")))) {
            event.setCancelled(true);
            stickyLocks.sendMessage(event.getPlayer(), "This block is protected from destruction", false);
        }
    }
}