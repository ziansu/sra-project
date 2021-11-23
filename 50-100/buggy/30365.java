public void init() {
    game.player1 = new player();
    java.awt.Color p1 = java.awt.Color.red;
    game.player2 = new player();
    java.awt.Color p2 = java.awt.Color.blue;
    game.screen = "start";
    game.xstart = -1;
    game.ystart = -1;
    game.xend = -1;
    game.yend = -1;
    game.xcord = -1;
    game.ycord = -1;
    addMouseListener(this);
    backbuffer = createImage(500, 600);
    backg = backbuffer.getGraphics();
}