private void publishProgress() {
    if (((mNextSendR) <= (bytesReceived)) || ((mNextSendS) <= (bytesReceived))) {
        long bR = (bytesReceived) / 1024;
        long bS = (bytesSent) / 1024;
        mNextSendR = (bR + 1) * 1024;
        mNextSendS = ((bS / 1024) + 1) * 1024;
        mCon.publishProgress(0, bS, bR);
    }
}