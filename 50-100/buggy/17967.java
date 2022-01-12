private void runOnUiThread(java.lang.Runnable runnable) {
    com.app.freethinkers.sensorlogger.FileOperations myFileOperations = new com.app.freethinkers.sensorlogger.FileOperations();
    java.lang.String ts = myFileOperations.getCurrentTimeStamp();
    writeLogToDisc("LogFile1.txt", (((((((((ts + ": ") + (mySensorValuesString[0])) + "; ") + (mySensorValuesString[1])) + "; ") + (mySensorValuesString[2])) + "; ") + (mySensorValuesString[3])) + "\n"));
}