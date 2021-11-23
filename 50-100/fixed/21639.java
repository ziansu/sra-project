@java.lang.Override
public void start(javafx.stage.Stage stage) {
    this.stage = stage;
    this.sprites = new nl.tudelft.scrumbledore.SpriteStore();
    setupGame();
    setupGUI();
    addKeyEventListeners(scene);
    addButtonEventListeners();
    renderStatic();
    animationTimer.start();
    stage.show();
}