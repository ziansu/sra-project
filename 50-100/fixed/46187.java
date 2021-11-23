public java.lang.String readMsg(java.net.Socket socket) throws java.io.IOException {
    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(socket.getInputStream()));
    char[] buffer = new char[500];
    int amount = bufferedReader.read(buffer, 0, 500);
    message = new java.lang.String(buffer, 0, amount);
    getKey(message);
    return decode(decrypted, keyString);
}