public void setFullscreen() {
    setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    java.awt.Dimension screensize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    xScaling = ((float) (screensize.width)) / 800.0F;
    yScaling = ((float) (screensize.height)) / 600.0F;
    canvas.setScaleX(xScaling);
    canvas.setScaleY(yScaling);
    ml.setScale(xScaling, yScaling);
    fullscreen = true;
}