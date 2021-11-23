private boolean canUseCommands(org.bukkit.command.CommandSender sender) {
    boolean canUse = sender.isOp();
    if (fr.crazyws.mccrestart.utils.ConfigUtils.active) {
        if (((!canUse) && (sender instanceof org.bukkit.entity.Player)) && ((fr.crazyws.mccrestart.MCCRestart.instance.permissions) != null)) {
            canUse = fr.crazyws.mccrestart.MCCRestart.instance.permissionsHandler.has(((org.bukkit.entity.Player) (sender)), "mccrestart.use");
        }
    }
    return canUse;
}