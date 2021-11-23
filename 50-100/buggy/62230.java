public static void setupFilter(org.bukkit.entity.Player player) {
    net.izenith.Main.IPlayer iPlayer = net.izenith.Main.IPlayerHandler.getPlayer(player);
    net.izenith.Main.Main main = net.izenith.Main.Vars.main;
    org.bukkit.configuration.file.FileConfiguration config = main.getConfig();
    java.lang.String filterName = iPlayer.getCommandSpy();
    if (filterName != null) {
        java.util.List<java.lang.String> list = config.getStringList(("commandspy.filters." + filterName));
        if (list != null) {
            Vars.commandSpy.put(player, new net.izenith.CommandSpy.CommandFilter(list));
        }
    }
}