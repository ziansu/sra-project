private static void openNewWindow(javafx.scene.Parent root, java.lang.String title) {
    if (DarkModeLogic.isDark)
        root.setBlendMode(javafx.scene.effect.BlendMode.DIFFERENCE);
    
    javafx.stage.Stage stage = new javafx.stage.Stage();
    stage.setTitle(title);
    stage.setScene(new javafx.scene.Scene(root));
    model.StatementLogic.currentStage = stage;
    stage.setResizable(false);
    stage.show();
}