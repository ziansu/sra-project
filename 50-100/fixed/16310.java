@javafx.fxml.FXML
protected void showMenu(javafx.event.ActionEvent event) {
    javafx.scene.Scene scene = _loader.getScene("menu");
    _stage.setScene(scene);
    _stage.show();
    if (((_mode) == "practice") && ((_currentQuestionNumber) > (_longestPractice))) {
        _longestPractice = _currentQuestionNumber;
        longestPractice.setText(java.lang.Integer.toString(_longestPractice));
        showAchievement("Longest practice session!");
        return ;
    }
}