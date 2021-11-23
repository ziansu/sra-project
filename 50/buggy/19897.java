@java.lang.Override
protected void onPostExecute(java.io.File result) {
    wakeLock.release();
    playLava(result);
}