@javafx.fxml.FXML
private void setLayer() {
    cpp.VNCreator.View.SceneEditor.ComboObj comboObj = layerSel.getValue();
    if (pane.isDisabled())
        pane.setDisable(false);
    
    actorPos.setActor(icons.get(comboObj.getActor().getName()), comboObj.getActor());
    imageSel.setValue(null);
}