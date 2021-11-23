public void render(java.awt.Graphics2D g2) {
    int i = 0;
    for (spaceArkanoid.controller.ball.sfx.BallTrailFade trail : trails) {
        i++;
        trail.render(g2);
    }
}