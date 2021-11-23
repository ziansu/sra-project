public void send_485() {
    byte[] cmd = new byte[]{ 36 , 50 , ((byte) (255)) , 35 , 10 };
    try {
        if ((mOutputStream) != null)
            mOutputStream.write(cmd);
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}