public void showArtistsDetails(int listViewFirstVisiblePosition) {
    artistArrayAdapter.clear();
    if ((artistsDetailsList) != null) {
        artistArrayAdapter.addAll(artistsDetailsList);
        mListView.setSelection(listViewFirstVisiblePosition);
    }
}