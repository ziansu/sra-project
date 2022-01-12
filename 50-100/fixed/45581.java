public void filterOptions(int page, java.lang.String filter) {
    if ((filter.equals(lastFilter)) && ((currentPage) == page)) {
        if (!(suggestionPopup.isAttached())) {
            suggestionPopup.showSuggestions(currentSuggestions, currentPage, totalMatches);
        }
        return ;
    }
    if (!(filter.equals(lastFilter))) {
        page = 0;
    }
    currentPage = page;
}