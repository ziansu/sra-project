public void onResume() {
    super.onResume();
    if (mRequestingLocationUpdates) {
        startLocationUpdates();
    }else
        if (!(checkPermissions())) {
            android.widget.Toast.makeText(this, "Enable Permissions for Location Services", Toast.LENGTH_SHORT).show();
        }
    
}