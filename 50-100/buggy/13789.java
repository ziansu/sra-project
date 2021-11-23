@javafx.fxml.FXML
private void checkNames(javafx.event.ActionEvent event) {
    boolean canWeStart = false;
    if (!(newField.getText().replaceAll(" ", "").isEmpty())) {
        gameStart.setDisable(true);
        game.GameMaster.setNames(newField.getText());
        canWeStart = true;
    }
    if (canWeStart == true) {
        init_game();
    }else
        errorTxt.setVisible(true);
    
}