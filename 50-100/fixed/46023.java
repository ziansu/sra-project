public void fillCarkParkData(final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> data) {
    if (pl.pikopl.openwro.core.database.DatabaseService.LOGGER.isTraceEnabled()) {
        pl.pikopl.openwro.core.database.DatabaseService.LOGGER.tracef("Entering fillCarkParkData: %s", data);
    }else {
        pl.pikopl.openwro.core.database.DatabaseService.LOGGER.info("Entering fillCarkParkData");
    }
    fillCarkParkLoadTable(data);
    pl.pikopl.openwro.core.database.DatabaseService.LOGGER.info("Leaving fillCarkParkData");
}