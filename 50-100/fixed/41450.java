@java.lang.Override
public void onLocationChanged(android.location.Location loc) {
    de.hof_university.studienarbeitss16.studienarbeit_android_ss16.Model.LatitudeLongitudeModel latlng;
    if (loc.hasSpeed()) {
        latlng = new de.hof_university.studienarbeitss16.studienarbeit_android_ss16.Model.LatitudeLongitudeModel(loc.getLatitude(), loc.getLongitude(), loc.getSpeed(), loc.getTime());
    }else {
        latlng = new de.hof_university.studienarbeitss16.studienarbeit_android_ss16.Model.LatitudeLongitudeModel(loc.getLatitude(), loc.getLongitude(), 0.0F, loc.getTime());
    }
    mapController.updateUserPosition(latlng);
    trackController.updateUserPosition(latlng);
}