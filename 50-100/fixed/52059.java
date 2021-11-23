public boolean execute(java.lang.String cmd, org.bukkit.command.CommandSender sender, java.lang.String label, java.lang.String[] args) {
    com.oresomecraft.AchieveOresome.Command command = com.oresomecraft.AchieveOresome.Command.createCommand(cmd, args);
    if (command != null) {
        command.execute(sender, args);
        return true;
    }else {
        return false;
    }
}