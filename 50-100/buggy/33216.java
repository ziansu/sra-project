public void run() {
    try {
        announce();
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
    running = true;
    while (running) {
        try {
            java.lang.String msgin = clientIn.readLine();
            this.handleClientCommand(msgin);
        } catch (java.io.IOException s) {
            java.lang.System.out.println("SocketException in Client Handler");
            try {
                shutdown();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    } 
}