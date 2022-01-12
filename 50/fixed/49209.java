@java.lang.Override
public void onPrepared(android.media.MediaPlayer mediaPlayer) {
    progressDialog.dismiss();
    myVideoView.seekTo(videoPosition);
    if ((videoPosition) == 0) {
    }else {
        myVideoView.pause();
    }
}