public void action() {
    try {
        java.lang.System.out.println("FIRING");
        w.fire();
        start = java.lang.System.currentTimeMillis();
    } catch (org.newdawn.slick.SlickException e) {
        e.printStackTrace();
    }
}