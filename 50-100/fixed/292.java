public void handle(javafx.event.ActionEvent ae) {
    primaryStage.close();
    gui.MainWindow mw = new gui.MainWindow();
    mw.setTestAndApp(schooltest, app);
    mw.start(primaryStage);
    mw.showQuestionType();
    mw.countdown();
    app.getCh().send("starttest", schooltest.getId());
    app.dropClient();
    app.setTestStarted(true);
}