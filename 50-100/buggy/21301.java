private void addDayToBuffer(java.util.Map<java.lang.Long, android.content.ContentValues> buffer, java.lang.String device, android.content.ContentValues dayData) {
    long timestamp = dayData.getAsLong(PowerGen.COLUMN_BASE_TIMESTAMP);
    if (buffer.containsKey(timestamp)) {
        java.lang.String insertCol = mDeviceToCol.get(device);
        buffer.get(timestamp).put(insertCol, ((java.lang.Long) (dayData.get(insertCol))));
    }else {
        buffer.put(timestamp, dayData);
    }
}