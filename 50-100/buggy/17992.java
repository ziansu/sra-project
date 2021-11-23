@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... v) {
    try {
        db.recordScore(name, score, java.lang.System.currentTimeMillis(), eic.beike.projectx.network.busdata.SimpleBusCollector.getInstance().getVinNumber());
    } catch (java.lang.Exception e) {
        android.util.Log.d("GameActivity", ("Error ending round: " + (e.getMessage())));
        return true;
    }
    return false;
}