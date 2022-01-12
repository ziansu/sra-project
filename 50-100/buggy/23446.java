public java.lang.String getLine() {
    try {
        byte[] line = getLineAsBytes();
        if ((line.length) == 0)
            return null;
        else
            return new java.lang.String(line, "UTF-8");
        
    } catch (java.io.UnsupportedEncodingException e) {
        android.util.Log.w(com.android.bluetooth.map.BluetoothMapbMessage.TAG, e);
        return null;
    }
}