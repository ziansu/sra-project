public com.ludoscity.findmybikes.StationItem getHighlightedStation() {
    com.ludoscity.findmybikes.StationItem toReturn = null;
    if (((mStationListView.getCheckedItemPosition()) != (android.widget.AdapterView.INVALID_POSITION)) && ((mStationListViewAdapter) != null)) {
        toReturn = ((com.ludoscity.findmybikes.StationItem) (mStationListViewAdapter.getItem(mStationListView.getCheckedItemPosition())));
    }
    return toReturn;
}