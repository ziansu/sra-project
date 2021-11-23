public void send_485() {
    byte[] cmd = new byte[]{ 36 , 50 , ((byte) (255)) , 35 , 10 };
    try {
        mOutputStream.write(cmd);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}