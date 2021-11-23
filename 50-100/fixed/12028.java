@org.bukkit.event.EventHandler
public void onSign(org.bukkit.event.block.SignChangeEvent e) {
    if (e.getLine(0).equalsIgnoreCase("[atm]")) {
        e.setLine(0, ((org.bukkit.ChatColor.DARK_GRAY) + "== ATM =="));
        e.setLine(1, ((((org.bukkit.ChatColor.GREEN) + "> ") + (org.bukkit.ChatColor.DARK_GRAY)) + "Withdraw"));
        e.setLine(2, ((org.bukkit.ChatColor.BLACK) + "Deposit"));
        e.setLine(3, ((org.bukkit.ChatColor.DARK_GRAY) + "Click for Balance"));
    }
}