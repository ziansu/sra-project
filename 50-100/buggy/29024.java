public static void main(java.lang.String[] args) {
    while (true) {
        try {
            UDP.AudioServerLaunch.server = new java.net.ServerSocket(UDP.AudioServerLaunch.PORT);
            java.net.Socket socket = UDP.AudioServerLaunch.server.accept();
        } catch (java.io.IOException e) {
            java.lang.System.out.println("Server could not connect. Port is in use.");
            e.printStackTrace();
        }
    } 
}