@java.lang.Override
protected java.lang.Void doInBackground(java.lang.String... params) {
    theVehicles = com.NathanOdong.londonbushunter.controller.RouteController.getVehiclesFromStopPoint(naptanId, databaseHelper);
    isFavourite = databaseHelper.isFavourite(naptanId);
    return null;
}