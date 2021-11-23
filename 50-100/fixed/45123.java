@javafx.fxml.FXML
public void initialize() {
    lbLayerSizes = new javafx.scene.control.Label[]{ lbLayer0 , lbLayer1 , lbLayer2 };
    paneOutLayerArrows = new javafx.scene.layout.Pane[]{ paneOut0 , paneOut1 , paneOut2 };
    lbLayerSizes[0].setText("3 Nodes");
    for (javafx.scene.layout.Pane p : paneOutLayerArrows)
        p.setVisible(true);
    
}