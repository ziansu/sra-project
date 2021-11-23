@java.lang.Override
public void setTarget(com.badlogic.gdx.scenes.scene2d.Actor actor) {
    if ((action) != null)
        action.setTarget(actor);
    
    this.target = actor;
    this.taken = 0;
}