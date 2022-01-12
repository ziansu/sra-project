@java.lang.Override
public void touchDragged(com.badlogic.ashley.core.Entity entity, float x, float y, int pointer) {
    if ((currentSelectedTool) != null) {
        com.uwsoft.editor.view.stage.Sandbox sandbox = com.uwsoft.editor.view.stage.Sandbox.getInstance();
        currentSelectedTool.stageMouseDragged(x, y);
    }
}