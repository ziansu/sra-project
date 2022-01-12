public org.bukkit.plugin.Plugin loadPlugin(final java.io.File plugin) {
    org.bukkit.plugin.Plugin pl;
    try {
        pl = org.bukkit.Bukkit.getServer().getPluginManager().loadPlugin(plugin);
        try {
            pl.onLoad();
        } catch (final java.lang.Exception e) {
            java.lang.System.out.println(java.lang.String.format(this.plugin.language.getString("Response.Error.FailedonLoad"), plugin.getName()));
            e.printStackTrace();
        }
        return pl;
    } catch (org.bukkit.plugin.InvalidPluginException | org.bukkit.plugin.InvalidDescriptionException | org.bukkit.plugin.UnknownDependencyException e) {
        e.printStackTrace();
    }
    return null;
}