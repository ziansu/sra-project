public static java.lang.String materialToString(org.bukkit.Material material) {
    if (material != null) {
        java.lang.String materialName = com.griefcraft.lwc.LWC.normalizeName(material);
        java.lang.String locale = com.griefcraft.lwc.LWC.getInstance().getLocale(materialName.toLowerCase());
        if (locale.startsWith("UNKNOWN_LOCALE_")) {
            locale = materialName;
        }
        return com.griefcraft.util.StringUtil.capitalizeFirstLetter(locale);
    }
    return "";
}