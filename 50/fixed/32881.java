private void markSavedSelectedItem(com.iolab.sightlocator.SightMarkerItem savedSelectedItem) {
    if (!(mCurrentSelectedItemsClustered.contains(savedSelectedItem))) {
        addSelectedMarkerDelayed(savedSelectedItem, com.iolab.sightlocator.SelectedMarkerManager.ITEM_RETRIEVAL_DURATION);
    }
}