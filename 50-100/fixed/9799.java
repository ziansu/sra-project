private void addHistoryToDb() {
    com.example.run.RunHistory newHistory = new com.example.run.RunHistory(mStartTime.getTime(), mRunnerData.getTime(), mRunnerData.getDistance(), mRunnerFilename);
    com.example.run.DatabaseHelper dbHelper = new com.example.run.DatabaseHelper(this);
    if ((mRouteId) == (HistoryActivity.NO_ROUTE_FLAG)) {
        dbHelper.addHistory(newHistory);
    }else
        if ((mRouteId) == (HistoryActivity.NEW_ROUTE_FLAG)) {
            dbHelper.newRoute(newHistory, com.example.run.MapsActivity.mRouteNamePrefix);
        }else {
            dbHelper.appendRunToRoute(newHistory, mRouteId);
        }
    
}