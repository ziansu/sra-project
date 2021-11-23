private void renderAndUpdateDisplay() {
    jRenderer3D.doRendering();
    imageRegion.setImage(jRenderer3D);
    imageRegion.repaint();
}