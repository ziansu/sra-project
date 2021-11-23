public emerald.portal.JourneyLauncher verifyJourneyTableValue(emerald.portal.enums.JourneyLauncherColumn column, java.lang.String jnName, java.lang.String value, boolean present) {
    if (!(column.equals(JourneyLauncherColumn.PRODUCT_GROUP))) {
        core.Assertions.verifyText(common.DriverManager.getDriver(DriverType.LOOP), emerald.portal.JourneyLauncher.jnRowValue(column, jnName), "text", value, false, present);
    }
    return this;
}