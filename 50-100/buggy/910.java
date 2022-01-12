public void writeLocation(android.location.Location location) throws java.io.IOException {
    mOutputStream.writeByte(epcc.ed.ac.uk.gcrf_rear.data.DataStore.SensorType.LOCATION.getType());
    mOutputStream.writeByte(epcc.ed.ac.uk.gcrf_rear.data.DataStore.VERSION);
    mOutputStream.writeLong(location.getTime());
    mOutputStream.writeDouble(location.getLatitude());
    mOutputStream.writeDouble(location.getLongitude());
    mOutputStream.writeDouble(location.getAltitude());
    mOutputStream.writeFloat(location.getAccuracy());
    (mNumRows)++;
}