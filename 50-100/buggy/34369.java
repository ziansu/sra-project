public java.lang.String read() {
    android.util.Log.d(cn.com.farsight.SerialService.SerialService.TAG, "read()");
    if (!(isInitOk))
        return "Error:can't find serialdevice";
    
    byte[] data = new byte[128];
    cn.com.farsight.SerialService.SerialService._read(data, 128);
    java.lang.String ret;
    try {
        ret = new java.lang.String(data, "GBK");
    } catch (java.io.UnsupportedEncodingException e1) {
        return "Error:can't EncodingException";
    }
    return ret;
}