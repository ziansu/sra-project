public void getBalance(org.bukkit.entity.Player player) {
    player.sendMessage((((org.bukkit.ChatColor.GREEN) + "Balance: ") + (me.ellbristow.ATMsigns.ATMsigns.economy.format(((double) (me.ellbristow.ATMsigns.ATMsigns.economy.getBalance(player.getName())))).replace(".00", ""))));
}