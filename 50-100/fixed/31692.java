@java.lang.Override
public void onStart() {
    super.onStart();
    updateUIReceiver = new com.princecoder.nanodegree.spotifytreamer.NowPlayingFragment.MediaPlayerUpdateUIReceiver();
    progressBarStartReceiver = new com.princecoder.nanodegree.spotifytreamer.NowPlayingFragment.MediaPlayerProgressBarStartReceiver();
    progressBarStopReceiver = new com.princecoder.nanodegree.spotifytreamer.NowPlayingFragment.MediaPlayerProgressBarStopReceiver();
    errorReceiver = new com.princecoder.nanodegree.spotifytreamer.NowPlayingFragment.MediaPlayerErrorReceiver();
    playPauseReceiver = new com.princecoder.nanodegree.spotifytreamer.NowPlayingFragment.MediaPlayerPlayPauseReceiver();
    repeatReceiver = new com.princecoder.nanodegree.spotifytreamer.NowPlayingFragment.MediaPlayerRepeatReceiver();
    shuffleReceiver = new com.princecoder.nanodegree.spotifytreamer.NowPlayingFragment.MediaPlayerShuffleReceiver();
    registerErrorBroadcast();
    registerPlayPauseBroadcast();
    registerProgressBarStartBroadcast();
    registerProgressBarStopBroadcast();
    registerUpdateUIBroadcast();
    registerRepeatBroadcast();
    registerShuffleBroadcast();
}