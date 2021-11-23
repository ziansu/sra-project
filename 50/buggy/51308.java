public double getPerItemBuyPrice() {
    double value = (prices[0]) / (amount);
    org.bukkit.Bukkit.broadcastMessage(("v: " + value));
    return value;
}