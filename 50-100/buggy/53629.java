public void setupUI(java.util.ArrayList<com.ludoscity.findmybikes.StationItem> stationsNetwork, boolean lookingForBike, java.lang.String stringIfEmpty) {
    if (stationsNetwork != null) {
        if (!(stationsNetwork.isEmpty())) {
            mStationRecyclerView.setVisibility(View.VISIBLE);
            mEmptyListTextView.setVisibility(View.GONE);
            getRecyclerViewAdapter().setupStationList(stationsNetwork);
            lookingForBikes(lookingForBike);
        }else {
            mStationRecyclerView.setVisibility(View.GONE);
            mEmptyListTextView.setText(stringIfEmpty);
            mEmptyListTextView.setVisibility(View.VISIBLE);
        }
    }
}