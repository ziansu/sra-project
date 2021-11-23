@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.i("Files", "Cleaning Cache");
    java.io.File posterDir = new java.io.File(((getCacheDir()) + "posters/"));
    if (posterDir.isDirectory()) {
        java.lang.String[] posters = posterDir.list();
        for (java.lang.String poster : posters) {
            if (poster.contains(".png")) {
                new java.io.File(posterDir, poster).delete();
            }
        }
    }
}