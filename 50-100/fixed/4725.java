public void clear() {
    healthKits = 0;
    securityCardLevel = 0;
    selectedItem = items[0];
    sidearm = null;
    primary = null;
    explosive = null;
    selectedWeapon = null;
    for (int j = 1; j < (items.length); j++) {
        items[j] = null;
    }
}