@java.lang.Override
protected void onPostExecute(java.util.Map<java.lang.Integer, java.util.Map> parseDict) {
    tempDataStorage.putAll(parseDict);
    int i = 0;
    for (java.util.Map.Entry<java.lang.Integer, java.util.Map> entry : parseDict.entrySet()) {
        currentDate = databaseManager.addDays(currentDate, i);
        java.util.Map<java.lang.String, java.util.Map> value = entry.getValue();
        updateStickyListView(value);
        i++;
        (loadDayLimit)--;
    }
    scheduleAllNotificationInBackground();
}