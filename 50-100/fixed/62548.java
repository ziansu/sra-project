public void updateDistanceView() {
    android.location.Location artLocation = new android.location.Location("");
    artLocation.setLatitude(pieceOfArt.getLatitude());
    artLocation.setLongitude(pieceOfArt.getLongitude());
    if ((userLocation) != null) {
        double distanceInMeters = userLocation.distanceTo(artLocation);
        double distanceInMiles = distanceInMeters / 1609.344;
        java.lang.String distanceValue = (java.lang.String.valueOf(java.lang.String.format("%.2f", distanceInMiles))) + " mi";
        distanceText.setText(distanceValue);
    }
}