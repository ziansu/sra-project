public void start() {
    player = new me.KeyBarricade2D.Player.Player(210, 250, 40, 40);
    try {
        stone = javax.imageio.ImageIO.read(getClass().getResourceAsStream("stone.png"));
        grass = javax.imageio.ImageIO.read(getClass().getResourceAsStream("grass.png"));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    loadMap();
}