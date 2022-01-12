public fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder area(final double latitude, final double longitude, final int radius) {
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.LATITUDE.getName(), latitude);
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.LONGITUDE.getName(), longitude);
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.RADIUS.getName(), radius);
    return this;
}