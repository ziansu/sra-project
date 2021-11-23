@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    android.util.Log.d("LifeCycle", "Video onSaveInstanceState");
    super.onSaveInstanceState(outState);
    outState.putInt("video_pos", vidView.getCurrentPosition());
}