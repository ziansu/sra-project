private void refreshSpeed(android.location.Location lastKnownLocation) {
    speedInKmH = (lastKnownLocation.getSpeed()) * 3.6;
    speedText.setText(((java.lang.Double.valueOf(speedInKmH).intValue()) + ""));
    android.util.Log.d(glae.speedlimitsmusic.PlaceholderFragment.TAG, ("speedText=" + speedText));
}