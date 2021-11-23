public void run() {
    while (running) {
        try {
            app.log("Waiting for client...");
            addClient(serverSocket.accept());
        } catch (java.net.SocketException e) {
            running = false;
        } catch (java.io.EOFException e) {
            running = false;
            app.log(e.getMessage());
            e.printStackTrace();
        } catch (java.io.IOException e) {
            app.log(e.getMessage());
            e.printStackTrace();
        }
    } 
}