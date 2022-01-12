public static void reloadConfig() throws java.io.FileNotFoundException, java.io.IOException {
    qic.Main.language = new qic.BlackmarketLanguage();
    qic.util.Config.loadConfig();
}