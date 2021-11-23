@java.lang.Override
public void performDeath() {
    this.addAction(com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence(deathAnimation(), finishTurn()));
}