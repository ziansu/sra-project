@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putLong(com.tahutelorcommunity.bakingapp.ui.ExoPlayerFragment.POSITION_BUNDLE_KEY, mExoplayer.getCurrentPosition());
}