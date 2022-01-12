public static void main(java.lang.String[] args) {
    try {
        org.newdawn.slick.AppGameContainer app = new org.newdawn.slick.AppGameContainer(new fi.ringofsnake.main.Main("Ring of Snake"));
        app.setShowFPS(true);
        app.setDisplayMode(1280, 720, false);
        app.setTargetFrameRate(60);
        app.start();
    } catch (java.lang.Exception e) {
        org.newdawn.slick.util.Log.error(e);
    }
}