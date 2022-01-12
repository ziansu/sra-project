private boolean commandCanBeHandled(org.bukkit.command.CommandSender sender, java.lang.String[] args) {
    if ((!(sender instanceof org.bukkit.entity.Player)) && (!(sender.isOp()))) {
        sender.sendMessage("Command can only be used by player who is op");
        return false;
    }
    return (args.length) == 1;
}