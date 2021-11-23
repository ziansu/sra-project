@java.lang.Override
public void processFinish(final java.lang.String response) {
    android.util.Log.v("delete response", response);
    final android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this.context);
    builder.setCancelable(true);
    builder.setTitle("Server response:");
    builder.setMessage(response);
    builder.show();
    if ("Product deleted successfully".equals(response)) {
        this.objects.remove(position);
        this.notifyDataSetChanged();
    }
}