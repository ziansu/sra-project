@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    try {
        con.disconnect();
    } catch (java.io.IOException e) {
        android.util.Log.e("ERROR", ("Read this: " + (e.getMessage())));
    }
}