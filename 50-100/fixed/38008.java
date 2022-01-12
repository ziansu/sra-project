private void run(javafx.stage.Stage primaryStage) {
    primaryStage.setTitle(QL.ui.Questionnaire.form.getId());
    initGrid();
    javafx.scene.Scene scene = new javafx.scene.Scene(QL.ui.Questionnaire.grid, 700, 350);
    primaryStage.setScene(scene);
    renderQuestionnaire();
    primaryStage.show();
}