@java.lang.Override
protected void onReset() {
    android.util.Log.i("loader", ("onReset-" + (tag)));
    if ((presenter) != null) {
        presenter = null;
    }
}