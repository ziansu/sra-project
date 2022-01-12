protected void sendResourceMessage(org.bukkit.command.CommandSender sender, java.lang.String pre, java.lang.String key, java.lang.Object... args) {
    java.lang.String org = com.github.ucchyocean.lc.Resources.get(key);
    if ((org == null) || (org.equals(""))) {
        return ;
    }
    java.lang.String msg = java.lang.String.format((pre + org), args);
    sender.sendMessage(msg);
}