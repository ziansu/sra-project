private void setupCommand() {
    org.bukkit.command.PluginCommand sc = getCommand("sc");
    sc.setExecutor(new de.lalo5.simplecoins.SCCmd());
    sc.setAliases(java.util.Collections.singletonList("simplecoins"));
}