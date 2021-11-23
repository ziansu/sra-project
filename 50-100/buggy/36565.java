public void render() {
    java.awt.image.BufferStrategy bs = getBufferStrategy();
    if (bs == null) {
        createBufferStrategy(3);
        return ;
    }
    java.awt.Graphics g = bs.getDrawGraphics();
    back.renderBackground(g);
    front.render(g);
    g.dispose();
    bs.show();
}