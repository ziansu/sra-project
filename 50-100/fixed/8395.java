public void addHistorySearch(com.savelives.entityclasses.SearchQuery sq) {
    java.util.ArrayList<com.savelives.entityclasses.SearchQuery> temp = new java.util.ArrayList<>();
    temp.add(sq);
    for (int i = 0; (i < ((MAX_HISTORY) - 1)) && (i < (historySearch.size())); i++) {
        temp.add(historySearch.get(i));
    }
    this.historySearch = temp;
}