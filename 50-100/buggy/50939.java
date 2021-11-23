public void draw(org.newdawn.slick.Graphics graphics) {
    try {
        if ((playerIdle) == null) {
            playerIdle = new org.newdawn.slick.Image("Sprites/powerup_slow.png");
            playerIdle.draw(getX(), getY(), 50, 100);
        }
    } catch (org.newdawn.slick.SlickException e) {
        e.printStackTrace();
    }
}