@org.bukkit.event.EventHandler
public void onPlayerChat(org.bukkit.event.player.AsyncPlayerChatEvent event) {
    if (event.isCancelled())
        return ;
    
    event.setCancelled(true);
    buttondevteam.lib.chat.TBMCChatAPI.SendChatMessage(buttondevteam.lib.TBMCPlayer.getPlayer(event.getPlayer()).asPluginPlayer(buttondevteam.chat.ChatPlayer.class).CurrentChannel, event.getPlayer(), event.getMessage());
}