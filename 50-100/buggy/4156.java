private static cgeo.geocaching.models.Geocache downloadCache(final java.lang.String geocode) {
    final cgeo.geocaching.SearchResult searchResult = cgeo.geocaching.models.Geocache.searchByGeocode(geocode, null, java.util.Collections.EMPTY_SET, true, cgeo.geocaching.connector.gc.WaypointsTest.handler);
    org.assertj.core.api.Assertions.assertThat(searchResult.getCount()).isEqualTo(1);
    return searchResult.getFirstCacheFromResult(LoadFlags.LOAD_WAYPOINTS);
}