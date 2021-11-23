@java.lang.Override
protected void onPostExecute(final java.lang.Exception ex) {
    super.onPostExecute(ex);
    onCollectionStopped();
    motherService.unregisterProgressListener(this);
    if (ex != null) {
        android.widget.Toast.makeText(this, "Failed to retrieve device status from mother node.  Please try again.", Toast.LENGTH_SHORT).show();
    }
}