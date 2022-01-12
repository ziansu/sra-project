@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    route = new com.polsl.roadtracker.database.entity.RouteData();
    route.start();
    routeDataDao.insert(route);
    startLocationUpdate();
    sensorReader.startSensorReading(route.getId(), this.getSharedPreferences("SensorReaderPreferences", Context.MODE_PRIVATE));
}