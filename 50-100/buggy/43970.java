public void startHardLevel() throws java.lang.Exception {
    javafx.application.Platform.runLater(() -> {
        javafx.stage.Stage stage = new javafx.stage.Stage();
        ((javafx.stage.Stage) (easyLevelButton.getScene().getWindow())).close();
        managers.GameManager gameManager = new managers.GameManager();
        models.level.BaseLevel level = new models.level.LevelHard();
        try {
            gameManager.start(stage, level, controllers.MenuController.username);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    });
}