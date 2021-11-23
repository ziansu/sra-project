private void refreshDisplay() {
    guiErasePub.publish(new Localization.GUIEraseMsg());
    displayMap();
    outputPath(rrtPath, java.awt.Color.RED);
    publishParticles();
    publishEllipse(prevPt.getX(), robotGoal.getY(), 0.1, 0.1, java.awt.Color.ORANGE);
}