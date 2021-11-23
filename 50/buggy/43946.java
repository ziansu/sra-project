public void onGeotagCreated(com.krabslite.geotagger.models.Geotag tag) {
    this.displayedGeotags.add(tag);
    adapter.notifyDataSetChanged();
    addGeotagMarker(tag);
}