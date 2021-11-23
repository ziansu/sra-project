public void testPlayer(java.lang.String player, org.bukkit.command.CommandSender sender) {
    if (playerOnline(player)) {
        sender.sendMessage(((((((((((((ChatColor.GOLD) + "") + (ChatColor.MAGIC)) + "aaaaa") + (ChatColor.RED)) + player) + (ChatColor.GOLD)) + "is online!") + (ChatColor.MAGIC)) + "aaaaa") + (ChatColor.GOLD)) + "\nRejoice!"));
    }else {
        sender.sendMessage((player + "is not online!"));
    }
}