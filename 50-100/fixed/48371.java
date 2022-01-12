private void onSearchPressed(java.lang.String search) {
    mSearchButton.setEnabled(false);
    hideSearch();
    if ((mListener) != null) {
        switch (mRadioGroup.getCheckedRadioButtonId()) {
            case R.id.artist_radioButton :
                new com.rowenetworks.concearch.tasks.ArtistSearchTask(mListener, search, mSearchButton);
                break;
            case R.id.venue_radioButton :
                new com.rowenetworks.concearch.tasks.VenueSearchTask(mListener, search, mSearchButton);
                break;
        }
    }
}