public void clear() {
    healthKits = 0;
    securityCardLevel = 0;
    selectedWeapon = null;
    selectedItem = items[0];
    sidearm = null;
    primary = null;
    explosive = null;
    for (int j = 1; j < (items.length); j++) {
        items[j] = null;
    }
}