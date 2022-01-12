public synchronized void stop() {
    running = false;
    if ((textures) != null) {
        for (webroom.engine.Texture t : textures) {
            t.stop();
        }
        timer.stop();
    }
}