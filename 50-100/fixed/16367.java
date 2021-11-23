private static void Sync() {
    java.lang.Long second = 1000L;
    try {
        if ((de.NabTrap.PhySIX.Engine.Display.Display.FPS) <= 1000) {
            java.lang.Thread.sleep((second / (de.NabTrap.PhySIX.Engine.Display.Display.FPS)));
        }else {
            java.lang.Thread.sleep(1);
        }
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}