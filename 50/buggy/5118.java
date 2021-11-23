public static void clearChat(int amount, org.bukkit.entity.Player player) {
    while (amount > 0) {
        player.sendMessage("");
        amount = amount - 1;
    } 
}