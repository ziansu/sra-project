public java.lang.String handleCommand(org.bukkit.command.CommandSender cs, com.gmail.marzipankaiser.argumentreader.Command cmd, java.lang.String label, java.lang.String[] args) {
    setCommandSender(cs);
    java.lang.String cmdstr = java.lang.String.join(" ", args);
    cs.sendMessage(cmdstr);
    return execute(cmdstr);
}