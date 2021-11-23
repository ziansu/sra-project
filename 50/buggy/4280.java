private void addTimestampsToLog(java.util.ArrayList<java.lang.Long> timestamps) {
    for (int index = 0; index < (timestamps.size()); index++)
        addTimestampToLog(index, timestamps.get(index));
    
}