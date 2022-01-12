private void render() {
    java.awt.Graphics g = getBufferStrategy().getDrawGraphics();
    g.clearRect(0, 0, summerrpg.GameFrame.WIDTH, summerrpg.GameFrame.HEIGHT);
    summerrpg.InstanceManager.render(g);
    g.dispose();
    getBufferStrategy().show();
}