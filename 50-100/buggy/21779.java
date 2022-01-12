public emerald.portal.AllJourneys verifyJourneyTableValue(emerald.portal.enums.JourneyLauncherColumn column, java.lang.String jnName, java.lang.String value, boolean present) {
    emerald.portal.JourneyLauncher.scrollToJourney(jnName);
    if (!(column.equals(JourneyLauncherColumn.PRODUCT_GROUP))) {
        core.Assertions.verifyText(common.DriverManager.getDriver(DriverType.LOOP), emerald.portal.AllJourneys.jnRowValue(column, jnName), "text", value, false, present);
    }
    return this;
}