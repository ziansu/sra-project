@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    android.util.Log.d(com.github.rtoshiro.view.video.FullscreenVideoView.TAG, "onCompletion");
    if (!(this.mediaPlayer.isLooping()))
        this.currentState = com.github.rtoshiro.view.video.FullscreenVideoView.State.PLAYBACKCOMPLETED;
    else
        this.currentState = com.github.rtoshiro.view.video.FullscreenVideoView.State.STARTED;
    
    if ((this.completionListener) != null)
        this.completionListener.onCompletion(mp);
    
}