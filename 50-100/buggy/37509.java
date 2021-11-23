public void update() {
    speedX += 0.5 * (Game.Ball.speedIncreasePerFrame);
    speedY += 0.5 * (Game.Ball.speedIncreasePerFrame);
    Graphics.Vector2f circlePos = circle.getCenter();
    circle.move(new Graphics.Vector2f(((float) ((circlePos.x) + (speedX))), ((float) ((circlePos.y) + (speedY)))));
}