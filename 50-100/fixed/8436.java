public void printMessage() {
    try {
        main.Peer.reader = new java.io.BufferedReader(new java.io.InputStreamReader(socket.getInputStream()));
        java.lang.String response;
        while ((response = main.Peer.reader.readLine()) != null) {
            java.lang.System.out.println(response);
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}