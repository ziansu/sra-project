public void sendData(java.lang.String data) {
    if (!(data.endsWith("/n")))
        data += "/n";
    
    if ((mmOutputStream) == null)
        return ;
    
    try {
        android.util.Log.d("BT", ("SendData: " + data));
        mmOutputStream.write(data.getBytes());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}