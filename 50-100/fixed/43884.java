boolean checktarget(javafx.scene.control.Button b) {
    int column = javafx.scene.layout.GridPane.getColumnIndex(b);
    int row = javafx.scene.layout.GridPane.getRowIndex(b);
    if ((((b.getGraphic()) == null) && ((column > 0) && (column < 11))) && ((row > 0) && (row < 11))) {
        return true;
    }else
        return false;
    
}