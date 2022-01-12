public void loadConfiguration() {
    if (!(getConfig().contains(".GoodGames"))) {
        logger.info("Config not found! Creating config.");
        getConfig().addDefault(".GoodGames.Guess the Number.Highest Number", 50);
        getConfig().addDefault(".GoodGames.Guess the Number.Number of tries", 52);
        getConfig().set(".GoodGames.Guess the Number.Highest Number", 50);
        getConfig().addDefault(".GoodGames.Guess the Number.Number of tries", 52);
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
}