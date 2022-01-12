public void filterOptions(int page, java.lang.String filter) {
    if ((filter.equals(lastFilter)) && ((currentPage) == page)) {
        if (!(suggestionPopup.isAttached())) {
            suggestionPopup.showSuggestions(currentSuggestions, currentPage, totalMatches);
        }
        return ;
    }
    if (!(filter.equals(lastFilter))) {
        if ("".equals(filter)) {
            page = -1;
        }else {
            page = 0;
        }
    }
    currentPage = page;
}