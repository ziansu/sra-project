public void exportButtonHandler(android.view.View view) {
    try {
        new com.myhitchhikingspots.utilities.DatabaseExporter().execute();
        ((com.myhitchhikingspots.MyHitchhikingSpotsApplication) (getApplicationContext())).loadDatabase();
    } catch (java.lang.Exception e) {
        com.crashlytics.android.Crashlytics.logException(e);
    }
}