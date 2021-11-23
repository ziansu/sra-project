protected void sendMessage(Lab2B.SIPMachine.Enums.Message message) throws java.io.IOException {
    java.lang.System.out.println(("Sending message: " + message));
    java.net.Socket s = stateData.getSocket();
    java.io.PrintWriter out = new java.io.PrintWriter(s.getOutputStream(), true);
    out.println(message);
    out.flush();
}