public static void disableAddProblemMode() {
    org.ecomap.android.app.fragments.EcoMapFragment.addproblemModeIsEnabled = false;
    org.ecomap.android.app.fragments.EcoMapFragment.setMarkerClickType(0);
    org.ecomap.android.app.fragments.EcoMapFragment.mapClusterer.deleteMarker();
    org.ecomap.android.app.fragments.EcoMapFragment.addProblemSnackbar.dismiss();
    org.ecomap.android.app.fragments.EcoMapFragment.fabAddProblem.setImageResource(R.drawable.ic_location_on_white_24dp);
}