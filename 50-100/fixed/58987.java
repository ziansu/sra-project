@java.lang.Override
protected void onPostExecute(android.media.MediaPlayer mediaPlayer) {
    if ((mediaPlayer == null) && ((originalUri) != null)) {
        android.util.Log.e(com.sony.sel.tvapp.fragment.VideoFragment.TAG, (("Error preparing DLNA URI " + (getUri())) + ". Retrying with normal MediaPlayer."));
        playVideoTask = new com.sony.sel.tvapp.fragment.VideoFragment.PlayVideoTask(getActivity(), originalUri, PREPARE_VIDEO_TIMEOUT);
        playVideoTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }else {
        super.onPostExecute(mediaPlayer);
    }
}