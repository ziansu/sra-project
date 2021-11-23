@java.lang.Override
protected void onProgressUpdate(java.lang.Object... object) {
    super.onProgressUpdate(object);
    android.util.Log.d("progressUpdate", (("progress: " + (((java.lang.Integer) (object[0])) * 2)) + "%"));
}