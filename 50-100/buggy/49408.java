@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    if ((setMyBlip.hasFailed()) || (getBlips.hasFailed())) {
        android.util.Log.i(TAG, "the api call has failed, not calling doTheWork() methods for the calls");
    }else {
        android.util.Log.i(TAG, "parsing and using the responses of the webservice");
        setMyBlip.doTheWork(getRadarDatabase());
        getBlips.doTheWork(getRadarDatabase());
        getRadarService().notifyNewData();
    }
}