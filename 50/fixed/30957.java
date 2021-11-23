public void onSearchByTitleClick(java.lang.String title) {
    repository.searchByTitle(title);
    view.updateRepository();
}