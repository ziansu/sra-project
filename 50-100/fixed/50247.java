@java.lang.Override
protected void doSearch(java.lang.String text) {
    if ((text != null) && (!(text.isEmpty()))) {
        searchString = getSearchString();
        if (!(searchString.isEmpty())) {
            search(0, true);
        }
    }
    textArea.requestFocus();
}