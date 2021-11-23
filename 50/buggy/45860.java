@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    java.lang.String str = levelBtn.getText().replaceAll("\\D+", "");
    int level = java.lang.Integer.parseInt(str);
    app.AppModel.startQuiz(app.scene.LevelSelectScene._isReview, level);
}