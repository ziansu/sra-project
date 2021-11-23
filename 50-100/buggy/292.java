public void handle(javafx.event.ActionEvent ae) {
    primaryStage.close();
    javafx.stage.Stage stage = new javafx.stage.Stage();
    gui.MainWindow mw = new gui.MainWindow();
    mw.setTestAndApp(schooltest, app);
    mw.start(stage);
    mw.showQuestionType();
    mw.countdown();
    app.getCh().send("starttest", schooltest.getId());
    app.dropClient();
    app.setTestStarted(true);
}