@java.lang.Override
public void handleMessage(android.os.Message msg) {
    synchronized(this) {
        for (int i = 0; i < (actualNumBytes[0]); i++) {
            readBufferToChar[i] = ((char) (readBuffer[i]));
        }
        appendData(readBufferToChar, actualNumBytes[0]);
    }
}