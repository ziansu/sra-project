public fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder betweenCreateDate(final java.util.Date begin, final java.util.Date end) {
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.FROM_CREATE_DATE.name(), this.df.format(begin));
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.TO_CREATE_DATE.name(), this.df.format(end));
    return this;
}