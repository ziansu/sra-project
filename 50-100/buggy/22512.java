public void addLocationToView(android.location.Location location) {
    android.util.Log.w(location_services.GPSPlotter.TAG, ("Location obtained is: " + (location.toString())));
    location_services.GPSPlotter.mCurrentLocation = location;
    db.Coordinate coord = new db.Coordinate(location_services.GPSPlotter.mCurrentLocation, location_services.GPSPlotter.mUserID);
    location_services.GPSPlotter.mDbHelper.insertCoordinate(coord);
    mAccount.addCoordinateToList(coord);
    java.util.List<db.Coordinate> list = mAccount.getList();
    mAccount.fragment.update(location_services.GPSPlotter.mCurrentLocation, list);
}