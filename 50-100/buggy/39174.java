private void renderInfoWindow(com.google.android.gms.maps.model.Marker marker, com.nextdoor.mapdemo.CustomInfoWindow.ViewHolder viewHolder) {
    if (photos.containsKey(marker.getId())) {
        whyWontThisImageShowUp(viewHolder.profileIcon, photos.get(marker.getId()));
    }else
        if (markerIdIconBlackList.contains(marker.getId())) {
            viewHolder.profileIcon.setImageResource(R.drawable.placeholder_dog);
        }else {
            viewHolder.profileIcon.setImageResource(R.drawable.placeholder_cat);
        }
    
    viewHolder.textNDTextTitle.setText(marker.getTitle());
    viewHolder.textNDTextSnippet.setText(marker.getSnippet());
}