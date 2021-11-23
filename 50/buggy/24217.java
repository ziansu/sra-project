public void makeConnection() {
    try {
        socket = new java.net.ServerSocket(port);
        java.lang.System.out.println("Listening...");
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("An exception was thrown");
        e.printStackTrace();
    }
}