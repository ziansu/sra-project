private void destinationReachedDialog() {
    android.app.AlertDialog.Builder d = new android.app.AlertDialog.Builder(cunycodes.parkmatch.MapsActivity.instance());
    d.setTitle("Destination reached! Did you find parking?").setNeutralButton("Yes", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            showLandingPage();
        }
    }).setNegativeButton("No", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            startPlacePickerActivity();
        }
    }).show();
}