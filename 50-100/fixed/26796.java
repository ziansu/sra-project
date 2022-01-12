@org.junit.Test
public void testCommandsExecution() {
    game.executeCommand(new GameCommands.ChangeSnakeVelocityCommand(Utils.VelocityVector.down));
    assertEquals(VelocityVector.down, game.snake.head.getVelocity());
    game.executeCommand(new GameCommands.ChangeSnakeVelocityCommand(Utils.VelocityVector.left));
    assertEquals(VelocityVector.left, game.snake.head.getVelocity());
}