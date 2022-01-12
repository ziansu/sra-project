public void addressButtonPress(android.view.View view) {
    android.util.Log.e(casaubon.outdooradventures.ParkDetail.TAG, ("address exists it is: " + (address)));
    java.lang.String uri = java.lang.String.format(java.util.Locale.ENGLISH, "google.navigation:q=%f,%f", selectedPark.getLatitude(), selectedPark.getLongitude());
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(uri));
    startActivity(intent);
}