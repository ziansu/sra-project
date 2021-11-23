public void stopAudioPlayer() {
    if ((babyfon.view.activity.MainActivity.mConnection) != null)
        MainActivity.mConnection.setOnReceiveDataListener(null);
    
    if ((babyfon.view.activity.MainActivity.mAudioPlayer) != null) {
        MainActivity.mAudioPlayer.stopPlaying();
        babyfon.view.activity.MainActivity.mAudioPlayer = null;
    }
}