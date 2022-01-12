public fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder toUpdateDate(final java.util.Date end) {
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.TO_UPDATE_DATE.getName(), this.df.format(end));
    return this;
}