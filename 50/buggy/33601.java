@java.lang.Override
public boolean canExecute(org.bukkit.command.CommandSender sender) {
    return (((args.length) == 0) && (Permissions.HIDE_SELF_FROM_SPECTATORS.grantedTo(sender))) || (Permissions.HIDE_OTHERS_FROM_SPECTATORS.grantedTo(sender));
}