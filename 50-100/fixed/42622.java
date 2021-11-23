public void setCellValueFactoryUserScoreTable() {
    if ((buttonPress) == false) {
        cCorrectGuesses.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("numGuesses"));
        cUser.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("user"));
        cTime.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("timeSeconds"));
    }else {
        cScore.setText("Score");
        cScore.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("value"));
    }
}