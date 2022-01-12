@java.lang.Override
public void run() {
    java.lang.String content = null;
    try {
        while ((content = mBufferedReader.readLine()) != null) {
            if ((mOnReceiverListener) != null) {
                mOnReceiverListener.onReceive(content, null);
            }
        } 
    } catch (java.io.IOException e) {
    }
}