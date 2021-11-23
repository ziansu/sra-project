public static void main(java.lang.String[] args) throws java.io.IOException, org.newdawn.slick.SlickException {
    launcher.LauncherFrame laucher = new launcher.LauncherFrame();
    int nbPlayer = 1;
    int nbBponus = 10;
    int temps = 30;
    org.newdawn.slick.AppGameContainer app = new org.newdawn.slick.AppGameContainer(new Slick2d.Game(nbPlayer, nbBponus, temps), 800, 600, false);
    app.setShowFPS(false);
    app.start();
}