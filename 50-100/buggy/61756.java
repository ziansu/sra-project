private void writeFile(java.util.ArrayList<wisdm.cis.fordham.edu.actitracker.SensorRecord> record, java.lang.String username, java.lang.String activityName, java.lang.String sensorName) {
    java.io.File directory = wisdm.cis.fordham.edu.actitracker.SensorFileSaver.getDirectory(this, username, activityName);
    java.io.File file = wisdm.cis.fordham.edu.actitracker.SensorFileSaver.createFile(this, directory, username, activityName, sensorName);
    wisdm.cis.fordham.edu.actitracker.SensorFileSaver.writeFile(file, record);
}