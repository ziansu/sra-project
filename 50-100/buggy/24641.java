private void showPreviousPage() {
    if ((current_page) == 0) {
        current_page = ((int) (java.lang.Math.ceil(((entries.size()) / (gui.mainscreen.searchbar.SuggestionList.ENTRIES_PER_PAGE)))));
    }
    current_page -= 1;
    showPage(current_page);
}