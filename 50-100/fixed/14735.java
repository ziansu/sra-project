public void startWithoutDelay(java.lang.String filepath, trips.CarActionsFilter... filter) {
    java.util.Set<trips.CarActionsFilter> filters = new java.util.HashSet(java.util.Arrays.asList(filter));
    trips.CarAction.addCreatedListener(this, filters);
    reader = new trips.ReadFromOpenXCFile(filepath);
    reader.startReading();
}