public void destroy() {
    org.codice.ddf.spatial.ogc.csw.catalog.source.CswSource.LOGGER.debug("{}: Entering destroy()", cswSourceConfiguration.getId());
    unregisterMetacardTypes();
    availabilityPollFuture.cancel(true);
    scheduler.shutdownNow();
}