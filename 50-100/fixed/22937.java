@org.junit.Before
public void setUp() throws java.lang.Exception {
    input = mock(model.Input.class);
    levelController = mock(controller.LevelController.class);
    screenController = mock(controller.ScreenController.class);
    player = new model.Player(0, 0, 0, 0, 0, 0, Settings.PLAYER_SPEED, input, levelController);
}