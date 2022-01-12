@net.md_5.bungee.event.EventHandler
public void onServerKick(net.md_5.bungee.api.event.ServerKickEvent event) {
    io.github.dead_i.bungeeweb.BungeeWeb.log(plugin, event.getPlayer(), 5, (((event.getPlayer().getServer().getInfo().getName()) + ": ") + (net.md_5.bungee.api.chat.BaseComponent.toPlainText(event.getKickReasonComponent()))));
}