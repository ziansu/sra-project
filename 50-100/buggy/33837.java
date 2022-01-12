@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... path) {
    main.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            bar.setVisibility(View.VISIBLE);
        }
    });
    try {
        com.gabapps.student.FTP.downloadSingleFile(path[0], path[1]);
        android.util.Log.d("FTP", "File Downloaded");
        return path[1];
    } catch (java.io.IOException e) {
        android.util.Log.e("FTP", "Can't download file");
    }
    return null;
}