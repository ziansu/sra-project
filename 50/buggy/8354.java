public void startRecord(java.lang.String recPath) {
    if ((mMp4Muxer) != null) {
        mMp4Muxer.record(new java.io.File(recPath));
    }
}