@java.lang.Override
public void show() {
    timer = -(READY_LENGTH);
    gameState = com.mattwrench.dodgeball.screens.GameScreen.GameState.READY;
    world = new com.mattwrench.dodgeball.models.World(World.Background.GYM);
    playerController = new com.mattwrench.dodgeball.controllers.PlayerController(world);
    enemyController = new com.mattwrench.dodgeball.controllers.EnemyController(world);
    ballController = new com.mattwrench.dodgeball.controllers.BallController(world);
    renderer = new com.mattwrench.dodgeball.views.WorldRenderer(world);
}