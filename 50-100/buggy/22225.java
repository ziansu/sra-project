protected boolean checkPermission(org.bukkit.entity.Player player, nl.antimeta.bukkit.framework.command.model.BukkitCommand bukkitCommand) {
    if (org.apache.commons.lang.StringUtils.isNotBlank(bukkitCommand.getPermission())) {
        if (player.hasPermission(bukkitCommand.getPermission())) {
            onNoPermission(bukkitCommand);
            return false;
        }
    }
    return true;
}