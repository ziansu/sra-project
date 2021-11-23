@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.d(com.rokid.movie.activity.MainActivity.TAG, ("onResume startPlay : " + (videoCommand.isStartedPlay())));
    if ((videoCommand) != null)
        videoCommand.resumePlay();
    
}