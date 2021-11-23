@org.bukkit.event.EventHandler
public void onChat(org.bukkit.event.player.AsyncPlayerChatEvent event) {
    if ((pw.paradaux.simapi.chatHandler.getChatStatus()) == true) {
        event.setCancelled(true);
    }else {
        event.setCancelled(false);
    }
}