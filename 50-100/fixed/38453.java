public static boolean checkCRC(java.net.Socket s) {
    try {
        java.io.InputStream is = s.getInputStream();
        int check = is.read();
        if (check == 1) {
            return true;
        }else {
            return false;
        }
    } catch (java.lang.Exception e) {
    }
    return false;
}