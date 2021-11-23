private void getFrame() {
    byte[] frame = new byte[18];
    try {
        int read = mSourceStream.read(frame, 0, 18);
        if (read == 18) {
            jmbe.audio.imbe.IMBEFrame imbe = new jmbe.audio.imbe.IMBEFrame(frame, mPreviousFrame);
            mPreviousFrame = imbe;
            mBuffer = mSynthesizer.getAudio(imbe);
        }else {
            mBuffer = null;
        }
    } catch (java.lang.Exception e) {
        jmbe.audio.imbe.IMBEConverterAudioInputStream.mLog.error("exception while reading from the source stream", e);
        mBuffer = null;
    }
}