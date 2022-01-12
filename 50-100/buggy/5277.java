public java.util.ArrayList<com.nucc.hackwinds.types.Condition> getConditionsForIndex(int index) {
    if ((mRawData) == null) {
        loadRawData();
    }else
        if (mRawData.isEmpty()) {
            loadRawData();
        }
    
    if (conditions.isEmpty()) {
        parseForecasts();
    }
    java.util.ArrayList<com.nucc.hackwinds.types.Condition> dayConditions = new java.util.ArrayList(conditions.subList((index * 6), 6));
    return dayConditions;
}