protected void sendMessage(java.lang.String message) throws java.io.IOException {
    java.lang.System.out.println(("Sending message: " + message));
    java.net.Socket s = stateData.getSocket();
    if (s == null)
        return ;
    
    java.lang.System.out.println(((("Sending through: " + (s.getInetAddress())) + "/") + (s.getPort())));
    java.io.PrintWriter out = new java.io.PrintWriter(s.getOutputStream(), true);
    out.println(message);
    out.flush();
}