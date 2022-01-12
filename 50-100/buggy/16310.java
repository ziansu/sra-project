@javafx.fxml.FXML
protected void showMenu(javafx.event.ActionEvent event) {
    if (((_mode) == "practice") && ((_currentQuestionNumber) > (_longestPractice))) {
        _longestPractice = _currentQuestionNumber;
        showAchievement("Longest practice session!");
        longestPractice.setText(java.lang.Integer.toString(_longestPractice));
    }
    javafx.scene.Scene scene = _loader.getScene("menu");
    _stage.setScene(scene);
    _stage.show();
}