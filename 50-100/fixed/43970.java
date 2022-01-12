public void startHardLevel() throws java.lang.Exception {
    javafx.application.Platform.runLater(() -> {
        javafx.stage.Stage stage = ((javafx.stage.Stage) (easyLevelButton.getScene().getWindow()));
        managers.GameManager gameManager = new managers.GameManager();
        models.level.BaseLevel level = new models.level.LevelHard();
        try {
            gameManager.start(stage, level, controllers.MenuController.username);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    });
}