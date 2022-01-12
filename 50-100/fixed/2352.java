private void addAnimationTabPanel(int width, int height, int frames) {
    animationFrameTabPanel = new org.happysoft.zxsprite.AnimationFrameTabPanel(this, width, height, frames);
    java.awt.Dimension d = animationFrameTabPanel.getPreferredSize();
    scrollPane.setViewportView(animationFrameTabPanel);
    setSize(d);
    repaint();
}