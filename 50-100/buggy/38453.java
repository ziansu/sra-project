public static boolean checkCRC(java.net.Socket s) {
    try {
        java.io.InputStream is = s.getInputStream();
        int check = is.read();
        return check == 1 ? true : false;
    } catch (java.lang.Exception e) {
    }
    return false;
}