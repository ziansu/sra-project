public java.lang.String[] receive() {
    java.lang.String data;
    try {
        data = in.readLine();
        if ((data == null) || (data.isEmpty()))
            return null;
        
        return data.split(":");
    } catch (java.io.IOException ioe) {
        android.util.Log.e("IOException caught: '", ("" + (ioe.getMessage())));
    }
    return null;
}