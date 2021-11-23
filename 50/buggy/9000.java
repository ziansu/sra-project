@java.lang.Override
public void onClick(android.view.View view) {
    if ((mStatus) == (STATUS_READY)) {
        mStatus = STATUS_RECOGNIZING;
        mTranscoder.transcode(mUser3GPFilePath, mUserWaveFilePath, this);
        updateStatus();
        return ;
    }
}