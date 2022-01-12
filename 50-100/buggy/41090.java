@java.lang.Override
public void create() {
    com.simplegame.SimpleGame.camera = new com.badlogic.gdx.graphics.OrthographicCamera(1280, 720);
    com.simplegame.SimpleGame.gameObjects = new java.util.ArrayList<com.simplegame.gameobjects.GameObject>();
    com.simplegame.SimpleGame.gameObjects.add(new com.simplegame.gameobjects.player.Player(500, 500));
    com.simplegame.SimpleGame.gameObjects.add(new com.simplegame.gameobjects.enemy.Enemy(120, 120));
    com.simplegame.SimpleGame.map = new com.simplegame.maps.Map();
    com.simplegame.SimpleGame.batch = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
    com.simplegame.SimpleGame.collisionHandler = new com.simplegame.CollisionHandler();
    stateMachine = new com.simplegame.states.StateMachine();
    stateMachine.changeState(new com.simplegame.states.gamestates.TitleState(stateMachine));
}