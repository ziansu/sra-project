public void addHistorySearch(com.savelives.entityclasses.SearchQuery sq) {
    this.historySearch.add(sq);
    if ((this.historySearch.size()) > (MAX_HISTORY)) {
        this.historySearch = ((java.util.ArrayList<com.savelives.entityclasses.SearchQuery>) (this.historySearch.subList(((this.historySearch.size()) - (MAX_HISTORY)), ((this.historySearch.size()) - 1))));
    }
}