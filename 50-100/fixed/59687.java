private static boolean verifyServer(java.net.Socket socket) {
    try {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(socket.getInputStream()));
        java.io.PrintWriter pw = new java.io.PrintWriter(socket.getOutputStream(), true);
        pw.println("verify");
        java.lang.String check = input.readLine();
        return "42".equals(check);
    } catch (java.io.IOException e) {
        return false;
    }
}