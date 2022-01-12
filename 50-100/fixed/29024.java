public static void main(java.lang.String[] args) {
    try {
        UDP.AudioServerLaunch.server = new java.net.ServerSocket(UDP.AudioServerLaunch.PORT);
        while (true) {
            try {
                java.net.Socket socket = UDP.AudioServerLaunch.server.accept();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        } 
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        java.lang.System.out.println("Server could not connect. Port is in use.");
    }
}