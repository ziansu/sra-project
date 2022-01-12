@javafx.fxml.FXML
void displayContextMenu(javafx.scene.input.MouseEvent e) {
    if (e.isSecondaryButtonDown()) {
        if ((currentButton) != null) {
            mainScroll.setPannable(false);
        }else {
            currentState = ui.MapEditorToolController.editorStates.SHOWINGEMPTYMENU;
            mainScroll.setPannable(false);
        }
    }
    switch (currentState) {
        case SHOWINGEMPTYMENU :
            contextActions(e);
            break;
        case SHOWINGNODEMENU :
            contextActions(e);
            break;
        default :
            break;
    }
}