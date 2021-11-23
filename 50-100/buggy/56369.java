private void doToast(java.lang.String message) {
    android.content.Context context = getApplicationContext();
    int duration = android.widget.Toast.LENGTH_SHORT;
    android.widget.Toast toast = android.widget.Toast.makeText(context, message, duration);
    toast.show();
    android.util.Log.d(LOG_TAG, ("was Toast: " + message));
}