public void printMessage() {
    try {
        main.Peer.reader = new java.io.BufferedReader(new java.io.InputStreamReader(socket.getInputStream()));
        java.lang.String message = main.Peer.reader.readLine();
        java.lang.System.out.println(("From: " + (id)));
        java.lang.System.out.println(message);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}