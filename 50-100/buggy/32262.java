private int getDamageFromArray(com.worldciv.filesystem.CustomItem[] customItems) {
    int damage = 0;
    for (int i = 0; i < (customItems.length); i++) {
        org.bukkit.Bukkit.broadcastMessage(((("getDmgFA:2 " + i) + ":") + (customItems[0].getDamage())));
        try {
            damage = damage + (customItems[i].getDamage());
        } catch (java.lang.NullPointerException e) {
        }
    }
    return damage;
}