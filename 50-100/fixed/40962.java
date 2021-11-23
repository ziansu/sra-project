public void handleMessage(android.os.Message msg) {
    try {
        firstPing = true;
        com.android.models.Measurement m = ((com.android.models.Measurement) (msg.obj));
        newMeasurementTable(m);
        progress.setVisibility(View.GONE);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}