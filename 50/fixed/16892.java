public fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder head(final int nb) {
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.HEAD.getName(), nb);
    return this;
}