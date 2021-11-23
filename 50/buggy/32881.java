private void markSavedSelectedItem(com.iolab.sightlocator.SightMarkerItem savedSelectedItem) {
    if (!(mCurrentSelectedItemsClustered.contains(savedSelectedItem))) {
        android.util.Log.d("MyLogs", "not clustered");
        addSelectedMarkerDelayed(savedSelectedItem, com.iolab.sightlocator.SelectedMarkerManager.ITEM_RETRIEVAL_DURATION);
    }
}