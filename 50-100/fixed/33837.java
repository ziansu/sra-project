@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... path) {
    try {
        com.gabapps.student.FTP.downloadSingleFile(path[0], path[1]);
        android.util.Log.d("FTP", "File Downloaded");
        return path[1];
    } catch (java.io.IOException e) {
        android.util.Log.e("FTP", "Can't download file");
    }
    return null;
}