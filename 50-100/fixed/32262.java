private int getDamageFromArray(com.worldciv.filesystem.CustomItem[] customItems) {
    int damage = 0;
    for (int i = 0; i < (customItems.length); i++) {
        try {
            damage = damage + (customItems[i].getDamage());
        } catch (java.lang.NullPointerException e) {
        }
    }
    return damage;
}