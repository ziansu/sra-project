public void stopService() {
    getActivity().stopService(mclab1.pages.MediaPlayerFragment.playIntent);
    getActivity().unbindService(mclab1.pages.MediaPlayerFragment.musicConnection);
}