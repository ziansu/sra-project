@java.lang.Override
public java.lang.Exception doInBackground(java.lang.Void... params) {
    try {
        if (!(mPlayer.isReadyToPlay())) {
            mPlayer.reset();
            mPlayer.setDataSource(mView.getDataSourceContext(), mVoicemailUri);
            mPlayer.setAudioStreamType(com.android.dialer.voicemail.VoicemailPlaybackPresenter.PLAYBACK_STREAM);
            mPlayer.prepare();
        }
        return null;
    } catch (java.lang.Exception e) {
        return e;
    }
}