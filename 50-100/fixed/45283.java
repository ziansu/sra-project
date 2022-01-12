public static java.lang.Boolean isEnchantmentEnabled(java.lang.String ench) {
    for (java.lang.String en : me.BadBones69.CrazyEnchantments.ECControl.allEnchantments().keySet()) {
        if (en.equalsIgnoreCase(ench)) {
            if (Main.settings.getEnchs().getBoolean((("Enchantments." + en) + ".Enabled"))) {
                return true;
            }
        }
    }
    return false;
}