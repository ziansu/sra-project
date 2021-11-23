private void updateUI() {
    oldLocation = null;
    java.lang.String s = java.lang.String.format("Your location: Latitude %.4f, Longitude %.4f.", myLocation.getLatitude(), myLocation.getLongitude());
    textLocation.setText(s);
}