@java.lang.Override
public void processFinish(java.lang.String response) {
    android.util.Log.v("delete response", response);
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this.context);
    builder.setCancelable(true);
    builder.setTitle("Server response:");
    builder.setMessage(response);
    builder.show();
    if (response.equals("Product deleted successfully")) {
        this.objects.remove(position);
        this.notifyDataSetChanged();
    }
}