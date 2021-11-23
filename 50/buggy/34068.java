public void rendererDispose() {
    java.lang.System.out.println("Disposing!");
    gWorld.getWorld().dispose();
    rayHandler.dispose();
    stage.dispose();
    b2dr.dispose();
}