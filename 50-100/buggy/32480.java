public void writeRecord(epcc.ed.ac.uk.gcrf_rear.data.DataPoint dataPoint) throws java.io.IOException {
    mOutputStream.writeByte(dataPoint.getSensorType().getType());
    mOutputStream.writeByte(epcc.ed.ac.uk.gcrf_rear.data.DataStore.VERSION);
    mOutputStream.writeLong(dataPoint.getTimestamp());
    mOutputStream.writeFloat(dataPoint.getX());
    mOutputStream.writeFloat(dataPoint.getY());
    mOutputStream.writeFloat(dataPoint.getZ());
    (mNumRows)++;
}