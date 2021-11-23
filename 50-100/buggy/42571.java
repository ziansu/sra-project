@java.lang.Override
public void run() {
    java.lang.String content = null;
    try {
        while ((content = mBufferedReader.readLine()) != null) {
            android.util.Log.e("~~~~~~~~~~~~~~~~", ("执行1" + content));
            if ((mOnReceiverListener) != null) {
                mOnReceiverListener.onReceive(content, null);
            }
        } 
    } catch (java.io.IOException e) {
    }
}