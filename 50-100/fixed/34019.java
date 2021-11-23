public void updatePlot() {
    updateData(false);
    filename = plotHist();
    java.awt.Point p = imp.getWindow().getLocation();
    imp.close();
    imp = ij.IJ.openImage(filename);
    ij.gui.ImageWindow.setNextLocation(p);
    imp.show();
    addSettingsText(imp);
    imp.getCanvas().disablePopupMenu(true);
    configureListeners(imp.getCanvas());
    pack();
    ij.gui.GUI.center(this);
}