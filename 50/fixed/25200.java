public void render() {
    java.awt.image.BufferStrategy bs = getBufferStrategy();
    if (bs == null) {
        createBufferStrategy(3);
        return ;
    }
}