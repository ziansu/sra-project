@java.lang.Override
public void initTool() {
    com.uwsoft.editor.view.stage.Sandbox sandbox = com.uwsoft.editor.view.stage.Sandbox.getInstance();
    if (!(sandbox.getSelector().selectionIsOneItem())) {
        sandbox.getSelector().clearSelections();
    }
    updateListeners();
    cursorManager = com.uwsoft.editor.Overlap2DFacade.getInstance().retrieveProxy(CursorManager.NAME);
    cursorManager.setCursor(CursorManager.CROSS);
}