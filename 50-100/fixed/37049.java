public static void addItemToKit(java.lang.String kitName, java.lang.String item) {
    ninja.leaping.configurate.ConfigurationNode valueNode = io.github.hsyyid.kits.config.Configs.getConfig(io.github.hsyyid.kits.utils.ConfigManager.kitsConfig).getNode(((java.lang.Object[]) ((("kits." + kitName) + ".item").split("\\."))));
    java.lang.String items = valueNode.getString();
    java.lang.String formattedItem = item + ",";
    io.github.hsyyid.kits.config.Configs.setValue(io.github.hsyyid.kits.utils.ConfigManager.kitsConfig, valueNode.getPath(), (items + formattedItem));
}