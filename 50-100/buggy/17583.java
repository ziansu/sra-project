@java.lang.Override
public void run() {
    this.init();
    int fps = 30;
    double timePerTick = 1.0E9 / fps;
    double deltaTime = 0;
    long lastTimeTicked = java.lang.System.nanoTime();
    long now;
    while (isRunning) {
        now = java.lang.System.nanoTime();
        deltaTime += (now - lastTimeTicked) / timePerTick;
        lastTimeTicked = now;
        if (deltaTime >= 1) {
            this.update();
            this.render();
            deltaTime--;
        }
    } 
    stop();
}