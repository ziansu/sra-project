@java.lang.Override
public void onStart() {
    super.onStart();
    if ((mPlayIntent) == null) {
        mPlayIntent = new android.content.Intent(getActivity(), si.vei.pedram.spotifystreamer.service.MusicService.class);
        getActivity().bindService(mPlayIntent, musicConnection, Context.BIND_AUTO_CREATE);
        getActivity().startService(mPlayIntent);
    }
    setController();
}