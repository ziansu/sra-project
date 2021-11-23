public java.lang.String read() {
    android.util.Log.d(cn.com.farsight.SerialService.SerialService.TAG, "read()");
    if (!(isInitOk))
        return "Error:can't find serialdevice";
    
    byte[] data = new byte[128];
    int count = cn.com.farsight.SerialService.SerialService._read(data, 128);
    java.lang.String ret;
    try {
        cn.com.farsight.SerialService.HEAD ret = new java.lang.String(data, 0, count, "GBK");
        ret = new java.lang.String(data, 0, count, "GBK");
    } catch (java.io.UnsupportedEncodingException e1) {
        return "Error:can't EncodingException";
    }
    return ret;
}