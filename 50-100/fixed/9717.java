public void refreshListView() {
    if ((currentRegisteredUser) != null) {
        journals = selectMyJournalsFromDB(mEmail);
    }else {
        journals = dbLink.selectAvailableJournals();
    }
    if ((journals) != null) {
        com.journee.utils.AlbumRecycleViewAdapter adapter = new com.journee.utils.AlbumRecycleViewAdapter(this, journals);
        mRecyclerView.setAdapter(adapter);
    }
}