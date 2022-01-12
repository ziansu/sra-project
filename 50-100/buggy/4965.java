@java.lang.Override
public void dataChanged(com.vaadin.client.widgets.Grid<java.lang.Object> grid, com.vaadin.client.widgets.Grid.Editor<java.lang.Object> editor, com.google.gwt.user.client.ui.Widget widget, java.lang.String newContent, int row, int col) {
    if (getState().hasCellEditListener) {
        com.vaadin.client.VConsole.log("RPC: cellUpdated");
        rpc.cellUpdated(row, col, newContent);
    }
    if (getState().hasRowEditListener) {
        com.vaadin.client.VConsole.log("RPC: rowUpdated");
        rpc.rowUpdated(row);
    }
}