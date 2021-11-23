public void addFile(final io.github.msdk.datamodel.rawdata.RawDataFile rawDataFile) {
    io.github.mzmine.gui.mainwindow.RawDataTreeItem wrap = new io.github.mzmine.gui.mainwindow.RawDataTreeItem(rawDataFile);
    javafx.scene.control.TreeItem<io.github.mzmine.gui.mainwindow.RawDataTreeItem> df1 = new javafx.scene.control.TreeItem(wrap);
    df1.setGraphic(new javafx.scene.image.ImageView(io.github.mzmine.project.MZmineGUIProject.fileIcon));
    rawDataRootItem.getChildren().add(df1);
    io.github.mzmine.gui.MZmineGUI.setSelectedTab("RawData");
}