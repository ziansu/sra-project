@java.lang.Override
public int getTotalCount() {
    try {
        org.oscm.paginator.PaginationFullTextFilter pagination = new org.oscm.paginator.PaginationFullTextFilter();
        applyFilters(getArrangeable().getFilterFields(), pagination);
        decorateWithLocalizedStatuses(pagination);
        fullTextSearchFilterValue = ((fullTextSearchFilterValue) == null) ? null : fullTextSearchFilterValue.trim();
        pagination.setFullTextFilterValue(fullTextSearchFilterValue);
        setTotalCount(subscriptionsService.getMySubscriptionsSizeWithFiltering(pagination).intValue());
    } catch (java.lang.Exception e) {
        org.oscm.ui.dialog.mp.usesubscriptions.MySubscriptionsLazyDataModel.logger.logError(Log4jLogger.SYSTEM_LOG, e, LogMessageIdentifier.ERROR);
    }
    return super.getTotalCount();
}