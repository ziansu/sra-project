private void showVideoView() {
    if (!(org.linphone.BluetoothManager.getInstance().isBluetoothHeadsetAvailable())) {
        org.linphone.mediastream.Log.w("Bluetooth not available, using speaker");
        org.linphone.LinphoneManager.getInstance().routeAudioToSpeaker();
        isSpeakerEnabled = true;
        speaker.setBackgroundResource(R.drawable.speaker_on);
    }
    video.setBackgroundResource(R.drawable.video_off);
    org.linphone.LinphoneManager.stopProximitySensorForActivity(this);
    replaceFragmentAudioByVideo();
    displayVideoCallControlsIfHidden();
}