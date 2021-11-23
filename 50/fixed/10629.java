protected boolean hasPermission(org.bukkit.command.CommandSender sender) {
    if (sender.hasPermission(("bendingitems.command." + (name)))) {
        return true;
    }else {
        return false;
    }
}