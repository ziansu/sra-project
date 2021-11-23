protected void onPostExecute(java.lang.String result) {
    android.util.Log.d(wisc.drivesense.uploader.UploaderService.TAG, ("uploading result:" + result));
    if (result == null) {
        stopService();
        return ;
    }
    try {
        long time = java.lang.Long.parseLong(result);
        dbHelper_.tripUploadDone(time);
    } catch (java.lang.Exception e) {
        android.util.Log.d(wisc.drivesense.uploader.UploaderService.TAG, e.toString());
    }
    this.cancel(true);
    android.os.SystemClock.sleep((1000 * 10));
    selectAndUploadOneFile(result);
}