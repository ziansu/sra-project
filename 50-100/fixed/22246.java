public void connectToServer() throws java.io.IOException {
    java.net.Socket socket = new java.net.Socket(serverIP, InstructorServer.PORT_NUM);
    input = new java.io.BufferedReader(new java.io.InputStreamReader(socket.getInputStream()));
    output = new java.io.PrintWriter(socket.getOutputStream(), true);
    java.lang.System.out.println("Start listening");
    new digiTakeNumber.Participant.ServerThread(this, socket).start();
}