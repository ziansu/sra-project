@java.lang.Override
public synchronized boolean readResponse(byte[] out, int toRead, org.cef.misc.IntRef acRead, org.cef.callback.CefCallback callback) {
    try {
        int ret = is.read(out, 0, toRead);
        if (ret <= 0)
            is.close();
        
        acRead.set(java.lang.Math.max(ret, 0));
        return ret > 0;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return false;
    }
}