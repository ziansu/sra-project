protected java.lang.String getInventoryTitle(com.elmakers.mine.bukkit.api.action.CastContext context) {
    com.elmakers.mine.bukkit.api.wand.Wand wand = context.getWand();
    com.elmakers.mine.bukkit.api.wand.WandUpgradePath path = (wand == null) ? null : wand.getPath();
    java.lang.String pathName = (path == null) ? "" : path.getName();
    java.lang.String title = context.getMessage("title", "Shop ($balance)");
    title = title.replace("$path", pathName);
    return title;
}