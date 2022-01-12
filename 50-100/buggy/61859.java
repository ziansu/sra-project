protected android.graphics.Bitmap doInBackground(java.lang.Integer... params) {
    if (isCancelled())
        return null;
    
    try {
        return android.graphics.BitmapFactory.decodeResource(getResources(), mImages.get(params[0]), mOptions);
    } catch (java.lang.OutOfMemoryError e) {
        com.crashlytics.android.Crashlytics.logException(e);
        return null;
    }
}