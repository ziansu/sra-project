public static void addMaterialToUseFlag(org.bukkit.Material mat, java.lang.String flag) {
    if ((mat != null) && (flag != null)) {
        com.bekvon.bukkit.residence.protection.FlagPermissions.matUseFlagList.put(mat, flag);
    }
}