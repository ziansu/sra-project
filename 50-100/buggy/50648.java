@java.lang.Override
public void run() {
    long lastTime = java.lang.System.currentTimeMillis();
    long delta;
    init();
    while (running) {
        delta = (java.lang.System.currentTimeMillis()) - lastTime;
        lastTime = java.lang.System.currentTimeMillis();
        update(delta);
        render();
    } 
}