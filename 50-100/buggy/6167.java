public void run() {
    try {
        java.lang.System.out.println("Bin jetzt vorm stream");
        inputStream = clientSocket.getInputStream();
        inputStreamReader = new java.io.InputStreamReader(inputStream, java.nio.charset.StandardCharsets.UTF_8);
        bufferedReader = new java.io.BufferedReader(inputStreamReader);
        outputStream = clientSocket.getOutputStream();
        outputStreamWriter = new java.io.OutputStreamWriter(outputStream, java.nio.charset.StandardCharsets.UTF_8);
        write("+OK POP3 server ready");
        java.lang.System.out.println("kurz vorm auth");
        authenticate();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}