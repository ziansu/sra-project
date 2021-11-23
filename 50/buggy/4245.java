public void loadConfig() throws java.io.IOException {
    net.md_5.bungee.config.Configuration config = org.nulldev.AdvancedPlusOne.Main.configurationProvider.load(org.nulldev.AdvancedPlusOne.Main.configFile);
    org.nulldev.AdvancedPlusOne.Main.MaxSlots = config.getInt("MaxSlots");
    org.nulldev.AdvancedPlusOne.Main.useProt = config.getBoolean("EnableCustomProtocol");
    protName = config.getString("ProtocolName");
}