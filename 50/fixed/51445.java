public void setSearchTerm(java.lang.String searchTerm) {
    cancelSearchTermResolutionAnimation();
    mSearchTermControl.setSearchTerm(searchTerm);
    resetSearchBarTermOpacity();
}