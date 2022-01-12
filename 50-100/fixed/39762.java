private boolean showCollectionViewForOptionItemId(int id) {
    if (id == (currentViewId)) {
        return true;
    }
    currentViewId = id;
    if (id == (R.id.collection_view_map)) {
        showMapView();
    }else
        if (id == (R.id.collection_view_card)) {
            showCardView();
        }
    
    return (currentViewId) == id;
}