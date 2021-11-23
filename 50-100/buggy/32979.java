public void selectItem(com.iolab.sightlocator.SightMarkerItem selectedItem, boolean delayed) {
    if (selectedItem != null) {
        removeSelectedItems();
        if (delayed) {
            addSelectedMarkerDelayed(selectedItem, com.iolab.sightlocator.SelectedMarkerManager.ITEM_RETRIEVAL_DURATION);
        }else {
            addSelectedMarker(selectedItem);
        }
        mCurrentSelectedItems.add(selectedItem);
    }
}