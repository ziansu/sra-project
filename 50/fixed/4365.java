@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    primaryStage.setTitle("Personal Expense Tracker");
    javafx.scene.Scene viewScene = viewExpenseScene();
    primaryStage.setScene(viewScene);
    primaryStage.show();
}