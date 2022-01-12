@java.lang.Override
public void onClick(android.view.View view) {
    if ((mStatus) == (STATUS_READY)) {
        mStatus = STATUS_RECOGNIZING;
        updateStatus();
        mTranscoder.transcode(mUser3GPFilePath, mUserWaveFilePath, this);
    }
}