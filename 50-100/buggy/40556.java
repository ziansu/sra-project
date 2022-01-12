void startRead() {
    mUserExecutor.execute(uploadErrorSetting(new org.chromium.net.JavaUrlRequest.CheckedRunnable() {
        @java.lang.Override
        public void run() throws java.lang.Exception {
            if ((mOutputChannel) == null) {
                mAdditionalStatusDetails = Status.CONNECTING;
                mUrlConnection.connect();
                mAdditionalStatusDetails = Status.SENDING_REQUEST;
                mOutputChannel = java.nio.channels.Channels.newChannel(mUrlConnection.getOutputStream());
            }
            mSinkState.set(org.chromium.net.JavaUrlRequest.SinkState.AWAITING_READ_RESULT);
            mUploadProvider.read(org.chromium.net.JavaUrlRequest.OutputStreamDataSink.this, mBuffer);
        }
    }));
}