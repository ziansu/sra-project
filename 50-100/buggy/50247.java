@java.lang.Override
protected void doSearch(java.lang.String text) {
    if ((text != null) && ((text.length()) > 0)) {
        searchString = getSearchString().toLowerCase();
        if (!(searchString.isEmpty())) {
            search(0, true);
        }
    }
    textArea.requestFocus();
}