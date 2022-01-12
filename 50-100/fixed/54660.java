@java.lang.Override
public void editorClosed(com.vaadin.client.widgets.Grid<java.lang.Object> grid, com.vaadin.client.widgets.Grid.Editor<java.lang.Object> editor, int row, int col, boolean cancel) {
    editorManager.clearDisabledColumns();
    if (getState().hasEditorCloseListener) {
        rpc.editorClosed(row, col, cancel);
    }
}