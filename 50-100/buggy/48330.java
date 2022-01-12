public static java.lang.String getDefaultPath(java.lang.String pth) {
    if (org.bukkit.Bukkit.getPluginManager().getPlugin("skUtilities").getConfig().getBoolean("useRootAsDefaultPath", true)) {
        java.lang.String dp = java.nio.file.Paths.get("").normalize().toAbsolutePath().toString();
        if (pth.contains(dp)) {
            return pth + (java.io.File.separator);
        }else {
            return (dp + (java.io.File.separator)) + pth;
        }
    }else {
        return pth;
    }
}