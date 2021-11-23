public void onSearchByTitleClick(java.lang.String title) {
    repository.clearResults();
    repository.searchByTitle(title);
    view.updateRepository();
}