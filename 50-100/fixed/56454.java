private void setSearchBannerState() {
    if ((!("".equals(adapter.getSearchQuery()))) || (adapter.isFilteringByCalloutResult())) {
        showSearchBanner();
        clearSearchButton.setVisibility(View.VISIBLE);
    }else {
        searchBanner.setVisibility(View.GONE);
        clearSearchButton.setVisibility(View.GONE);
    }
}