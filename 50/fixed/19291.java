void displayCoordinates(@android.support.annotation.NonNull
java.lang.String latitude, @android.support.annotation.NonNull
java.lang.String longitude, @android.support.annotation.Nullable
java.lang.String altitude, float accuracy) {
    statusIndicator.setText(getContext().getString(R.string.geo_location_accuracy, accuracyFormat.format(accuracy)));
    displayCoordinates(latitude, longitude, altitude);
}