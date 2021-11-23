public void draw(com.badlogic.gdx.graphics.glutils.ShapeRenderer canvas) {
    tbs.bassjump.objects.Player.setShapeRotation(((tbs.bassjump.objects.Player.playerJumpPercentage) * 180));
    tbs.bassjump.objects.Player.c.set(Game.color);
    canvas.rect(xPos, yPos, scale, scale);
}