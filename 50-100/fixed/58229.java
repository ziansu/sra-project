public static void inject(wgextender.Config config) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.NoSuchFieldException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.reflect.InvocationTargetException {
    org.bukkit.command.Command command = wgextender.utils.CommandUtils.getCommands().get("region");
    org.bukkit.command.Command wrapper = new wgextender.wgcommandprocess.WGRegionCommandWrapper(config, command);
    wgextender.utils.CommandUtils.unregisterCommand(wgextender.WGExtender.getInstance().getWorldGuard(), command);
    wgextender.utils.CommandUtils.registerCommand(wgextender.WGExtender.getInstance().getWorldGuard(), wrapper);
}