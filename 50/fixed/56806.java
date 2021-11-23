@java.lang.Override
protected void onStart() {
    super.onStart();
    if (checkLocationPermission())
        getScheduleLatest(java.lang.String.valueOf(vn.efode.vts.application.ApplicationController.getCurrentUser().getId()));
    
}