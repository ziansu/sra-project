private void saveAsPng(javafx.scene.chart.LineChart lc, java.lang.String fName) {
    javafx.scene.image.WritableImage fImage = lineChart.snapshot(new javafx.scene.SnapshotParameters(), null);
    java.io.File iFile = new java.io.File(fName);
    try {
        javax.imageio.ImageIO.write(javafx.embed.swing.SwingFXUtils.fromFXImage(fImage, null), "png", iFile);
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(moncgui.AnalyzerController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}