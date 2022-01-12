@java.lang.Override
public void create() throws java.io.IOException {
    java.net.ServerSocket welcomeSocket = new java.net.ServerSocket(portNumber);
    while (true) {
        java.net.Socket connectionSocket = welcomeSocket.accept();
        java.io.BufferedReader inFromClient = new java.io.BufferedReader(new java.io.InputStreamReader(connectionSocket.getInputStream()));
        java.io.DataOutputStream outToClient = new java.io.DataOutputStream(connectionSocket.getOutputStream());
        java.lang.System.out.println(inFromClient.readLine());
        outToClient.writeBytes(inFromClient.readLine());
        welcomeSocket.close();
    } 
}