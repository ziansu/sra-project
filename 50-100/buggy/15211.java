private void setupSearchQuery() {
    java.lang.String defaultBeginDate = getString(R.string.earliestSearchBeginDate);
    java.lang.String defaultEndDate = com.simonc312.searchnyt.helpers.DateHelper.getInstance().getFilterFormatDate(new java.util.Date());
    java.lang.String defaultSections = "\"Article\"";
    searchQuery = new com.simonc312.searchnyt.models.SearchQuery("", defaultBeginDate, defaultEndDate, defaultSections);
}