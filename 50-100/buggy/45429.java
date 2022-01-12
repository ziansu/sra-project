private boolean checkNeededParams(javafx.scene.control.TextField[] params) {
    int count = 0;
    for (javafx.scene.control.TextField param : params) {
        if (param.getText().equals("")) {
            param.setStyle("-fx-border-color: red ; -fx-border-width: 2px ;");
            count++;
        }
    }
    if (count == 0) {
        return true;
    }
    return false;
}