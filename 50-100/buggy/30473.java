private static void sendBytes(java.io.FileInputStream file, java.io.DataOutputStream outToClient) throws java.lang.Exception {
    byte[] buffer = new byte[1024];
    int bytes = 0;
    while ((bytes = file.read(buffer)) != (-1)) {
        outToClient.write(buffer, 0, bytes);
    } 
}