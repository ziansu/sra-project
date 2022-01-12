private void setMode(java.lang.Boolean isActive) {
    if (isActive) {
        locationManager.removeUpdates(this);
        locationManager.requestLocationUpdates(getBestProvider(), 1000, 0, this);
        android.widget.Toast.makeText(context, "Active Mode", Toast.LENGTH_SHORT).show();
    }else {
        locationManager.removeUpdates(this);
        locationManager.requestLocationUpdates(getBestProvider(), 300000, 100, this);
        android.widget.Toast.makeText(context, "DeActive", Toast.LENGTH_SHORT).show();
    }
}