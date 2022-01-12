public static long recountDataSize() {
    java.lang.String[] fileNames = com.adsamcik.signalcollector.DataStore.getDataFileNames(true);
    long size = 0;
    for (java.lang.String fileName : fileNames)
        size += com.adsamcik.signalcollector.DataStore.sizeOf(fileName);
    
    com.adsamcik.signalcollector.Setting.getPreferences().edit().putLong(com.adsamcik.signalcollector.DataStore.KEY_SIZE, size).apply();
    return size;
}