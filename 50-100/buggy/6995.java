public static com.tealcubegames.minecraft.spigot.versions.api.actionbars.ActionBarMessage createActionBarMessage(java.lang.String message) {
    java.lang.String serverPackageName = org.bukkit.Bukkit.getServer().getClass().getPackage().getName();
    java.lang.String nmsVersion = serverPackageName.substring(serverPackageName.lastIndexOf(("." + 1)));
    switch (nmsVersion) {
        case "v1_10_R1" :
            return new com.tealcubegames.minecraft.spigot.versions.actionbars.ActionBarMessageImpl(message);
        default :
            throw new org.apache.commons.lang3.NotImplementedException((nmsVersion + " is not supported"));
    }
}