private static void closeCurrentWindow() {
    model.StatementLogic.currentStage.close();
    model.StatementLogic.currentStage = new javafx.stage.Stage();
}