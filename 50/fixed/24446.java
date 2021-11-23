@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    android.util.Log.d("LifeCycle", "Video onSaveInstanceState");
    super.onSaveInstanceState(outState);
    if ((vidView) != null)
        outState.putInt("video_pos", vidView.getCurrentPosition());
    
}