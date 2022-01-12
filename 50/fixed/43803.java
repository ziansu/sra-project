public void action() {
    try {
        w.fire();
        start = java.lang.System.currentTimeMillis();
    } catch (org.newdawn.slick.SlickException e) {
        e.printStackTrace();
    }
}