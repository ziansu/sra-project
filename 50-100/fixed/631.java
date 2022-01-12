private void stopDecoding() {
    decoding = false;
    mBufferedSamples = 0;
    if ((decoderThread) != null) {
        decoderThread.interrupt();
        try {
            decoderThread.join();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
    if ((feedThread) != null) {
        try {
            feedThread.join();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}