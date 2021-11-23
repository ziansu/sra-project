public fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder area(final double latitude, final double longitude, final int radius) {
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.LATITUDE.name(), latitude);
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.LONGITUDE.name(), longitude);
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.RADIUS.name(), radius);
    return this;
}