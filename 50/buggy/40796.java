@java.lang.Override
public void keyboardFocusChanged(net.peakgames.libgdx.stagebuilder.core.keyboard.FocusEvent event, com.badlogic.gdx.scenes.scene2d.Actor actor, boolean focused) {
    super.keyboardFocusChanged(event, actor, focused);
    if (focused && (actor instanceof com.badlogic.gdx.scenes.scene2d.ui.TextField)) {
        textFieldFocusChanged(actor.getName());
    }
}