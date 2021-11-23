@java.lang.Override
public double getBalance(java.lang.String playerName) {
    return com.kkosyfarinis.spigot.xssentials.methods.Configurations.getPlayerConfig(playerName).getDouble("economy.balance");
}