@org.junit.Before
public void setUp() throws java.lang.Exception {
    input = org.mockito.Mockito.mock(model.Input.class);
    levelController = org.mockito.Mockito.mock(controller.LevelController.class);
    screenController = org.mockito.Mockito.mock(controller.ScreenController.class);
    player = new model.Player(0, 0, 0, 0, 0, 0, Settings.PLAYER_SPEED, input, levelController);
}