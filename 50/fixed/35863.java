private void addBookmark(com.malmstein.yahnac.data.DataPersister persister, com.malmstein.yahnac.model.Story story) {
    persister.addBookmark(story);
    showAddedBookmarkSnackbar(persister, story);
}