protected static final <T> void registerUpgrade(java.lang.String cannonName, java.lang.String upgradeName, T defaultValue, java.lang.Class<T> type) {
    de.pesacraft.cannonfight.util.shop.UpgradeMap upgrades;
    if (de.pesacraft.cannonfight.util.cannons.Cannon.UPGRADE_MAP.containsKey(cannonName))
        upgrades = ((de.pesacraft.cannonfight.util.shop.UpgradeMap) (de.pesacraft.cannonfight.util.cannons.Cannon.UPGRADE_MAP.get(cannonName)));
    else {
        upgrades = new de.pesacraft.cannonfight.util.shop.UpgradeMap();
        de.pesacraft.cannonfight.util.cannons.Cannon.UPGRADE_MAP.put(cannonName, upgrades);
    }
    upgrades.setUpgrade(upgradeName, 2, 100, defaultValue, type);
}