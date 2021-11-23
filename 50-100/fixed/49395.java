protected java.lang.String getInventoryTitle(com.elmakers.mine.bukkit.api.action.CastContext context) {
    com.elmakers.mine.bukkit.api.wand.Wand wand = context.getWand();
    com.elmakers.mine.bukkit.api.wand.WandUpgradePath path = (wand == null) ? null : wand.getPath();
    java.lang.String pathName = (path == null) ? null : path.getName();
    if (pathName == null) {
        pathName = "";
    }
    java.lang.String title = context.getMessage("title", "Shop ($balance)");
    title = title.replace("$path", pathName);
    return title;
}