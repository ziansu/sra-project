public static void main(java.lang.String[] args) {
    try {
        org.newdawn.slick.ApplicationGDXContainer container = new org.newdawn.slick.ApplicationGDXContainer(new bounceAnator.BounceAnator(), 480, 800, 480, 800);
        container.start();
    } catch (org.newdawn.slick.SlickException e) {
        e.printStackTrace();
    }
}