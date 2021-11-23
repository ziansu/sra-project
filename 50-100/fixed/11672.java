void enable(org.bukkit.plugin.java.JavaPlugin plugin) {
    this._plugin = plugin;
    se.fredsfursten.donationboardplugin.BoardController.numberOfDays = se.fredsfursten.donationboardplugin.DonationBoardPlugin.getPluginConfig().getInt("Days");
    se.fredsfursten.donationboardplugin.BoardController.numberOfLevels = se.fredsfursten.donationboardplugin.DonationBoardPlugin.getPluginConfig().getInt("Levels");
    this._model = new se.fredsfursten.donationboardplugin.BoardModel(se.fredsfursten.donationboardplugin.BoardController.numberOfDays, se.fredsfursten.donationboardplugin.BoardController.numberOfLevels);
    load();
}