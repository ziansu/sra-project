public boolean onCommand(cn.nukkit.command.CommandSender sender, cn.nukkit.command.Command command, java.lang.String label, java.lang.String[] args) {
    if ((args.length) < 1) {
        return false;
    }
    java.lang.String reason = java.lang.String.join(" ", args);
    db.getDB("config").set("reason", reason);
    db.message(sender, (("Set <" + reason) + "> whitelist message."));
    return true;
}