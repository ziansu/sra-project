private void populateField(com.csc436.team_bubble_sort.lunchroll.entities.Restaurant r) {
    latitudeView.setText(((r.getLatitude()) + ""));
    longitudeView.setText(((r.getLongitude()) + ""));
    nameView.setText(r.getName());
    priceLevelView.setText(r.getPriceLevel());
    ratingView.setText(r.getRating());
}