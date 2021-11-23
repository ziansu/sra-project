public static java.lang.String[] getDataFileNames(boolean includeLast) {
    int maxID = com.adsamcik.signalcollector.Setting.getPreferences(com.adsamcik.signalcollector.DataStore.context).getInt(com.adsamcik.signalcollector.DataStore.KEY_FILE_ID, 0);
    if (!includeLast)
        maxID--;
    
    java.lang.String[] fileNames = new java.lang.String[maxID + 1];
    for (int i = 0; i <= maxID; i++)
        fileNames[i] = (com.adsamcik.signalcollector.DataStore.DATA_FILE) + i;
    
    return fileNames;
}