public void run() {
    while (running) {
        java.lang.String message = client.receive();
        if (message.startsWith("/c/")) {
            client.setID(java.lang.Integer.parseInt(message.split("/c/|/e/")[1]));
            console(("Successfully connected to server. ID: " + (client.getID())));
        }
    } 
}