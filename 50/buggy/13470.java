@net.md_5.bungee.event.EventHandler
public void onLeave(net.md_5.bungee.api.event.PlayerDisconnectEvent pEvent) {
    CHAT_MANAGER.changeState(pEvent.getPlayer().getUniqueId());
}