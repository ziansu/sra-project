public int getAppStartRow(java.lang.String appName, java.util.List<java.util.List<java.lang.String>> data) {
    int appStartRow = 0;
    int rowCount = data.size();
    for (int x = 0; x < rowCount; x++) {
        if (data.get(x).get(1).equalsIgnoreCase(appName)) {
            return appStartRow = x;
        }
    }
    return appStartRow;
}