@java.lang.Override
protected void onPostExecute(java.util.Map<java.lang.Integer, java.util.Map> parseDict) {
    int i = 0;
    for (java.util.Map.Entry<java.lang.Integer, java.util.Map> entry : parseDict.entrySet()) {
        java.util.Map<java.lang.String, java.util.Map> value = entry.getValue();
        updateStickyListView(value);
        i++;
        currentDate = databaseManager.addDays(currentDate, 1);
        (loadDayLimit)--;
    }
    scheduleAllNotificationInBackground();
}