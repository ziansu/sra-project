public static void main(java.lang.String[] args) {
    try {
        CoreLogic.AppGameContainer appgc;
        appgc = new CoreLogic.AppGameContainer(new CoreLogic.SimpleSlickGame("test"));
        appgc.setDisplayMode(0, 0, false);
        appgc.start();
    } catch (CoreLogic.SlickException ex) {
    }
}