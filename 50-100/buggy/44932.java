private void performLogin(org.bukkit.entity.Player sender, java.lang.String label, java.lang.String[] args) {
    if (!(ru.mrbrikster.safeauth.PluginManager.isRegistred(sender))) {
        sender.sendMessage(format(ru.mrbrikster.safeauth.Main.getLocConfig().getString("notRegistred")));
        return ;
    }
    if ((args.length) != 1) {
        return ;
    }
    java.lang.String passwordHash = ru.mrbrikster.safeauth.PluginManager.createPasswordHash(args[0]);
    ru.mrbrikster.safeauth.PluginManager.login(sender, passwordHash);
}