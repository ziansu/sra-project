private void refreshDisplay() {
    guiErasePub.publish(new Localization.GUIEraseMsg());
    displayMap();
    outputPath(rrtPath, java.awt.Color.RED);
    publishParticles();
    publishEllipse(prevPt.getX(), prevPt.getY(), 0.1, 0.1, java.awt.Color.ORANGE);
}