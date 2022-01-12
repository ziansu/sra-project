@java.lang.Override
public void onLocationChanged(android.location.Location loc) {
    de.hof_university.studienarbeitss16.studienarbeit_android_ss16.Model.LatitudeLongitudeModel latlng;
    if (loc.hasSpeed()) {
        latlng = new de.hof_university.studienarbeitss16.studienarbeit_android_ss16.Model.LatitudeLongitudeModel(loc.getLatitude(), loc.getLongitude(), loc.getSpeed());
    }else {
        latlng = new de.hof_university.studienarbeitss16.studienarbeit_android_ss16.Model.LatitudeLongitudeModel(loc.getLatitude(), loc.getLongitude(), 0.0F);
    }
    mapController.updateUserPosition(latlng);
    trackController.updateUserPosition(latlng);
}