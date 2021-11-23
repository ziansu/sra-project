@java.lang.Override
public void finish() {
    com.badlogic.gdx.scenes.scene2d.actions.Delay.pool.free(this);
    if ((action) != null)
        action.finish();
    
    super.finish();
}