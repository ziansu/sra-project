private void onDaysLoaded(java.util.List<org.threeten.bp.LocalDate> days) {
    loadingIndicator.setVisibility(View.GONE);
    if (days.isEmpty()) {
        logger.warn("List of days was empty");
        emptyView.setVisibility(View.VISIBLE);
    }else {
        logger.debug("Found %s days", days.size());
        emptyView.setVisibility(View.GONE);
        adapter.setDays(days);
        pager.setCurrentItem(position);
    }
}