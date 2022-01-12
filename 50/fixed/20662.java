@java.lang.Override
public double getBalance(java.lang.String playerName) {
    if ((com.kkosyfarinis.spigot.xssentials.methods.Configurations.getPlayerConfig(playerName).getString("economy.balance")) != null) {
        return com.kkosyfarinis.spigot.xssentials.methods.Configurations.getPlayerConfig(playerName).getDouble("economy.balance");
    }
    return 0;
}