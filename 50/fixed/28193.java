@java.lang.Override
public void onStop() {
    super.onStop();
    if (musicBound) {
        getActivity().unbindService(this);
        musicBound = false;
        mMusicService = null;
    }
}