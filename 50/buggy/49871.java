@java.lang.Override
public void onAbort(final com.hound.android.sdk.VoiceSearchInfo info) {
    voiceSearch = null;
    resetUIState();
}