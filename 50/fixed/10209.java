public void cmdReload(org.bukkit.command.CommandSender s) {
    HCH.reloadConfigs();
    s.sendMessage(gvlfm78.plugin.Hotels.managers.Mes.mes("chat.commands.reload.success"));
}