@java.lang.Override
public void onPlayerError(com.google.android.exoplayer2.ExoPlaybackException error) {
    java.lang.String msg = (((error != null) && ((error.getMessage()) != null)) && (!(error.getMessage().isEmpty()))) ? " " + (error.getMessage()) : "";
    android.widget.Toast.makeText(mActivity, ((mActivity.getString(R.string.video_error_unknown_error)) + msg), Toast.LENGTH_LONG).show();
}