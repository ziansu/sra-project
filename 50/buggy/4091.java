@java.lang.Override
protected void onResume() {
    super.onResume();
    if (videoCommand.isStartedPlay()) {
        android.util.Log.d(com.rokid.movie.activity.MainActivity.TAG, ("onResume startPlay : " + (videoCommand.isStartedPlay())));
        videoCommand.resumePlay();
    }
}