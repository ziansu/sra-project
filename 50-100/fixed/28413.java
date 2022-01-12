@javax.annotation.concurrent.GuardedBy(value = "mLock")
private boolean shouldRestartPacketReader() {
    return (((((!(mPacketReaderActive)) && (!(tooManyPendingPackets()))) && ((mPosToQueue) < (mRequest.mEnd))) && ((mError) == null)) && (!(mCancel))) && (!(mEof));
}