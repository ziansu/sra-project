@java.lang.Override
protected void onPrepareDialog(int id, android.app.Dialog dialog) {
    super.onPrepareDialog(id, dialog);
    for (net.osmand.plus.activities.DialogProvider dp : dialogProviders) {
        dp.onPrepareDialog(id, dialog);
    }
}