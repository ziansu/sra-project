private static void sendBytes(java.io.FileInputStream file, java.io.DataOutputStream outToClient) throws java.io.IOException {
    byte[] buffer = new byte[1024];
    int bytes = 0;
    synchronized(file) {
        while ((bytes = file.read(buffer)) != (-1)) {
            outToClient.write(buffer, 0, bytes);
        } 
    }
}