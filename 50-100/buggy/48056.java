private void moveCursor() {
    javafx.scene.Node temp = getNodeByRowColumnIndex(getLocation_row(), getLocation_col());
    temp.setStyle("");
    if ((temp.getAccessibleText().charAt(0)) == '\n') {
        (row)++;
        if ((row) >= (application.model.Settings.getLine())) {
            endOfPage();
        }
        column = 0;
    }else {
        (column)++;
    }
    application.VirtualCursor.getNodeByRowColumnIndex(row, column, gridPane).setStyle("-fx-background-color:green");
}