public static void main(java.lang.String[] args) {
    int screenH = 640;
    int screenW = 1024;
    try {
        org.newdawn.slick.AppGameContainer appgc;
        appgc = new org.newdawn.slick.AppGameContainer(new example.SimpleSlickGame("Breakout"));
        appgc.setDisplayMode(screenW, screenH, false);
        appgc.start();
    } catch (org.newdawn.slick.SlickException ex) {
        java.util.logging.Logger.getLogger(example.SimpleSlickGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}