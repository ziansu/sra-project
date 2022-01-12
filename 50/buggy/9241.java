public void connectToServer() {
    boolean connected = false;
    gc = new orbit.OrbitGame.GameClient();
    gc.start();
    java.lang.System.out.println("Connected to server!");
}