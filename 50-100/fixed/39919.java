protected static final <T> void registerUpgrade(java.lang.String cannonName, java.lang.String upgradeName, java.lang.Class<T> type) {
    try {
        de.pesacraft.cannonfight.util.cannons.Cannon.registerUpgrade(cannonName, upgradeName, type.newInstance(), type);
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException ex) {
        de.pesacraft.cannonfight.util.cannons.Cannon.registerUpgrade(cannonName, upgradeName, null, type);
    }
}