@java.lang.Override
public void handle(long now) {
    long updateLength = now - (lastLoopTime);
    lastLoopTime = now;
    lastFpsTime += updateLength;
    (fps)++;
    if ((lastFpsTime) >= (gamelogic.GameLoop.NANOS_PER_SECOND)) {
        java.lang.System.out.println((("(FPS: " + (fps)) + ")"));
        lastFpsTime = 0;
        currFps = fps;
        fps = 0;
    }
    gameComponent.update(updateLength);
    gameComponent.draw();
}