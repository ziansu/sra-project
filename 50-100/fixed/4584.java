@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    try {
        mediaPlayer = android.media.MediaPlayer.create(appContext, mediaID);
        mediaPlayer.setLooping(false);
        return true;
    } catch (android.content.res.Resources rnfe) {
        android.util.Log.e(com.aarondevelops.alma_mater.BackgroundFragments.BackgroundMediaFragment.MEDIA_HELPER_TAG, (("Media with resourceID " + (mediaID)) + " not found."));
        return false;
    }
}