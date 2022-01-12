public void run() {
    try {
        serverSocket.close();
        java.lang.System.out.println("Server has been stopped.");
        java.io.FileOutputStream fos = new java.io.FileOutputStream(args[0]);
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);
        oos.writeObject(MultiDNSServer.database);
        oos.close();
        fos.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}