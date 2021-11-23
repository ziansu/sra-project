public void run() {
    try {
        in = new java.util.Scanner(client.getInputStream());
        out = new java.io.PrintWriter(client.getOutputStream());
        requestName();
        doService();
        client.close();
        server.removeFromServices(this);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}