@java.lang.Override
protected void onPostExecute(java.lang.Boolean compressed) {
    super.onPostExecute(compressed);
    java.io.File video = new java.io.File(compressedpath);
    if ((mListener) != null) {
        if ((video.exists()) && ((video.length()) > 0)) {
            mListener.videocompressed(compressed);
            android.util.Log.d(Config.LOGTAG, "Compression successfully!");
        }else {
            mListener.videocompressed(false);
            android.util.Log.d(Config.LOGTAG, "Compression failed!");
        }
    }
    wakeLock.release();
}