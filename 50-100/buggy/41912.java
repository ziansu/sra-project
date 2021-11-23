@java.lang.Override
public void controlResized(org.eclipse.core.tools.ControlEvent event) {
    org.eclipse.core.tools.TableColumn column = ((org.eclipse.core.tools.TableColumn) (event.widget));
    int columnNumber = viewer.getTableTree().getTable().indexOf(column);
    totalTable.getColumn(columnNumber).setWidth(column.getWidth());
}