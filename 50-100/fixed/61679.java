@java.lang.Override
public DragAndDrop.Payload dragStart(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int pointer) {
    com.badlogic.gdx.scenes.scene2d.utils.DragAndDrop.Payload payload = new com.badlogic.gdx.scenes.scene2d.utils.DragAndDrop.Payload();
    com.badlogic.gdx.scenes.scene2d.ui.Tree.Node node = tree.getNodeAt(y);
    if (node != null) {
        payload.setObject(node);
        return payload;
    }
    return null;
}