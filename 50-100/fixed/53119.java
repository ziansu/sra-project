@org.junit.Test
public void testSnakeExtension() {
    game.executeCommand(new GameCommands.ChangeSnakeVelocityCommand(Utils.VelocityVector.down));
    game.update();
    assertEquals(game.snake.getLength(), 6);
    game.executeCommand(new GameCommands.ChangeSnakeVelocityCommand(Utils.VelocityVector.right));
    game.update();
    assertEquals(game.snake.getLength(), 9);
}