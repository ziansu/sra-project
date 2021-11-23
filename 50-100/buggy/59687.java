private static boolean verifyServer(java.net.Socket socket) {
    boolean verified = false;
    try {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(socket.getInputStream()));
        java.io.PrintWriter pw = new java.io.PrintWriter(socket.getOutputStream(), true);
        pw.println("verify");
        java.lang.String check = input.readLine();
        verified = "42".equals(check);
        if (verified)
            pw.println("server");
        
        return verified;
    } catch (java.io.IOException e) {
        return false;
    }
}