private void requestContent() {
    if ((mFetchResultHandler) != null) {
        mFetchResultHandler.destroy();
    }
    mFetchResultHandler = new com.android.dialer.voicemail.VoicemailPlaybackPresenter.FetchResultHandler(new android.os.Handler(), mVoicemailUri);
    mView.setIsFetchingContent();
    android.content.Intent intent = new android.content.Intent(android.provider.VoicemailContract.ACTION_FETCH_VOICEMAIL, mVoicemailUri);
    mContext.sendBroadcast(intent);
}