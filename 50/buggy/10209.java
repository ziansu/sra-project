public void cmdReload(org.bukkit.command.CommandSender s, org.bukkit.plugin.Plugin pluginstance) {
    HCH.reloadConfigs();
    s.sendMessage(gvlfm78.plugin.Hotels.managers.Mes.mes("chat.commands.reload.success"));
}