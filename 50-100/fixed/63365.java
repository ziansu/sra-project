public void execute(net.md_5.bungee.api.CommandSender sender, java.lang.String[] strings) {
    sender.sendMessage(new net.md_5.bungee.api.chat.ComponentBuilder(msg.replace("{name}", server)).color(ChatColor.AQUA).create());
    net.md_5.bungee.api.connection.ProxiedPlayer p = ((net.md_5.bungee.api.connection.ProxiedPlayer) (sender));
    p.connect(core.getProxy().getServerInfo(server));
}