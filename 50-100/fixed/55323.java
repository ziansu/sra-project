public org.bukkit.plugin.Plugin loadPlugin(final java.io.File plugin) {
    org.bukkit.plugin.Plugin p;
    try {
        p = org.bukkit.Bukkit.getPluginManager().loadPlugin(plugin);
        try {
            p.onLoad();
        } catch (final java.lang.Exception e) {
            java.lang.System.out.println(java.lang.String.format(this.plugin.language.getString("Response.Error.FailedonLoad"), plugin.getName()));
            e.printStackTrace();
        }
        return p;
    } catch (org.bukkit.plugin.InvalidPluginException | org.bukkit.plugin.InvalidDescriptionException | org.bukkit.plugin.UnknownDependencyException e) {
        e.printStackTrace();
    }
    return null;
}