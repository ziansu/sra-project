private void stopDecoding() {
    decoding = false;
    mBufferedSamples = 0;
    decoderThread.interrupt();
    try {
        decoderThread.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    try {
        feedThread.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}