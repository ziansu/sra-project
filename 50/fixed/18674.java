@javafx.fxml.FXML
protected void popupCloseButtonAction() {
    popupLayer.getChildren().clear();
    org.jimple.planner.ui.UiController.isSearch = false;
    org.jimple.planner.ui.UiController.isConflictedShown = false;
    overlay.setVisible(false);
}