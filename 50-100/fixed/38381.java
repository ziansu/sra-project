@org.bukkit.event.EventHandler
public void onPlayerChat(org.bukkit.event.player.AsyncPlayerChatEvent event) {
    if (event.isCancelled())
        return ;
    
    buttondevteam.lib.chat.TBMCChatAPI.SendChatMessage(buttondevteam.lib.TBMCPlayer.getPlayer(event.getPlayer()).asPluginPlayer(buttondevteam.chat.ChatPlayer.class).CurrentChannel, event.getPlayer(), event.getMessage());
    event.setCancelled(true);
}