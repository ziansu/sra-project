@java.lang.Override
public void act(float delta) {
    super.act(delta);
    com.badlogic.gdx.math.Vector2 velocity = myrddin.getLinearVelocity();
    if ((velocity.y) == 0)
        myrddin.setMyrddinState(new fr.imac.myrddin.game.myrddin.MyrddinIddle(myrddin));
    
    moveInTheAir();
}