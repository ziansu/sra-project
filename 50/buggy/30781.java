@java.lang.Override
protected void onPause() {
    super.onPause();
    app.pomis.reciper.ContentSelector.addingContents.clear();
    app.pomis.reciper.ContentSelector.notAddedContents.clear();
}