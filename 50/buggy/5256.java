private void startGamemode2() {
    java.util.List<java.lang.String> questions = gm2Logic.getQuestions();
    this.mainStageController.showGamemode2View();
    this.mainStageController.showQuestions(questions);
}