private void publishProgress() {
    if (((mNextSendR) <= (bytesReceived)) || ((mNextSendS) <= (bytesReceived))) {
        long bR = bytesReceived;
        long bS = bytesSent;
        mNextSendR = ((bR / 1024) + 1) * 1024;
        mNextSendS = ((bS / 1024) + 1) * 1024;
        mCon.publishProgress(0, bS, bR);
    }
}