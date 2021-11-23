@java.lang.Override
public void dragStop(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int pointer, com.badlogic.gdx.scenes.scene2d.utils.DragAndDrop.Payload payload, com.badlogic.gdx.scenes.scene2d.utils.DragAndDrop.Target target) {
    this.getActor().setVisible(true);
    for (com.badlogic.gdx.scenes.scene2d.utils.DragAndDrop.Target oldTarget : validTargets) {
        oldTarget.getActor().remove();
        dragDrop.removeTarget(oldTarget);
    }
}