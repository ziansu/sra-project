@java.lang.Override
public int read(byte[] dest, int timeoutMillis) throws java.io.IOException {
    final int numBytesRead;
    synchronized(mReadBufferLock) {
        int readAmt = java.lang.Math.min(dest.length, mReadBuffer.length);
        numBytesRead = java.lang.Math.min(readAmt, mConnection.bulkTransfer(mReadEndpoint, mReadBuffer, readAmt, timeoutMillis));
        if (numBytesRead < 0) {
            return 0;
        }
        java.lang.System.arraycopy(mReadBuffer, 0, dest, 0, numBytesRead);
    }
    return numBytesRead;
}