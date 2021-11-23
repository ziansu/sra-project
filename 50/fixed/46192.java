public fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder strictlyBetween(final double start, final double end) {
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.GREATER.getName(), start);
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.LOWER.getName(), end);
    return this;
}