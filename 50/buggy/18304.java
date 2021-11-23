private void updateItems() {
    java.lang.String query = com.bignerdranch.android.photogallery.QueryPreferences.getStoredQuery(getActivity());
    lastPageFetched = 0;
    new com.bignerdranch.android.photogallery.PhotoGalleryFragment.FetchItemsTask(query).execute(lastPageFetched);
}