public void add(final org.bukkit.command.CommandSender p, java.lang.String[] args) {
    java.lang.String haste = args[1];
    com.spleefleague.core.SpleefLeague.getInstance().getDynamicCommandManager().register(haste, (org.bukkit.ChatColor color,java.lang.String txt) -> {
        p.sendMessage((color + txt));
    });
}