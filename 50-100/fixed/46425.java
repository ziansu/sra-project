@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    mp = new com.neet.DiamondHunter.MapViewer.MapPane();
    mapStack.relocate(60, 60);
    mapStack.setPrefSize(((double) (((mp.getNumRows()) * (mp.getTileSize())) - 15)), ((double) (((mp.getNumCols()) * (mp.getTileSize())) - 15)));
    initMapCanvas();
    initTileMapping();
}