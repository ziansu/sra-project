@java.lang.Override
public boolean equals(org.bukkit.command.CommandSender sender) {
    if (sender == null)
        return false;
    
    return this.sender.equals(sender);
}