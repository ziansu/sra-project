public static boolean isCB178orLater() {
    if ((org.bitbucket.ucchy.undine.Utility.isCB178orLaterCache) == null) {
        org.bitbucket.ucchy.undine.Utility.isCB178orLaterCache = org.bitbucket.ucchy.undine.Utility.isUpperVersion(org.bukkit.Bukkit.getBukkitVersion(), "1.7.8");
    }
    return org.bitbucket.ucchy.undine.Utility.isCB178orLaterCache;
}