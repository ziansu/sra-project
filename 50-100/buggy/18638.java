private void setCursorLocation(javafx.scene.layout.GridPane gp, final int row, final int column, boolean isInputCorrect) {
    if (isInputCorrect) {
        application.VirtualCursor.getNodeByRowColumnIndex(row, column, gp).setStyle("-fx-background-color:green");
    }else {
        application.VirtualCursor.getNodeByRowColumnIndex(0, 0, gp).setStyle("-fx-background-color:red");
    }
}