@java.lang.Override
public void onResume() {
    super.onResume();
    getActivity().bindService(mPlaybackService, mConnection, Context.BIND_AUTO_CREATE);
}