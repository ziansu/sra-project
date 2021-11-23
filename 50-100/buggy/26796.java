@org.junit.Test
public void testCommandsExecution() {
    game.executeCommand(new GameCommands.ChangeSnakeVelocityCommand(Utils.VelocityVector.down));
    org.junit.Assert.assertEquals(VelocityVector.down, game.snake.head.getVelocity());
    game.executeCommand(new GameCommands.ChangeSnakeVelocityCommand(Utils.VelocityVector.left));
    org.junit.Assert.assertEquals(VelocityVector.left, game.snake.head.getVelocity());
}