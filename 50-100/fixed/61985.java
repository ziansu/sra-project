@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.i("Files", "Cleaning Cache");
    java.lang.String[] posters = getCacheDir().list();
    for (java.lang.String poster : posters) {
        if (poster.contains(".png")) {
            new java.io.File(getCacheDir(), poster).delete();
        }
    }
}