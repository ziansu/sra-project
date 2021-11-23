public void run() {
    while (true) {
        try {
            sock = server.accept();
            Batman.BatThread bat = new Batman.BatThread(sock);
            bat.start();
            Players.add(bat);
            java.lang.System.out.println("Client connected");
        } catch (java.lang.Exception e) {
            java.lang.System.out.println("Error! New client connection aborted");
        }
    } 
}