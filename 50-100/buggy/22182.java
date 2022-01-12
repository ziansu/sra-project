private void startSearch() {
    if ((voiceSearch) != null) {
        voiceSearch.abort();
    }
    setProgressBarIndeterminateVisibility(true);
    voiceSearch = new com.hound.android.sdk.VoiceSearch.Builder().setRequestInfo(getHoundRequestInfo()).setAudioSource(new com.hound.android.sdk.audio.SimpleAudioByteStreamSource()).setClientId(Constants.CLIENT_ID).setClientKey(Constants.CLIENT_KEY).setListener(voiceListener).build();
    voiceSearch.start();
}