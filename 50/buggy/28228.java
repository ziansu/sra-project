@javafx.fxml.FXML
void centerClicked() {
    root.setCenterAnimated(center, this);
    root.setLeftAnimated(leftSide, null);
}