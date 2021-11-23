private void inputText(final java.lang.String text, boolean replace, org.eclipse.jubula.rc.common.implclasses.table.Cell cell) throws org.eclipse.jubula.rc.common.exception.StepExecutionException {
    org.eclipse.jubula.rc.common.tester.adapter.interfaces.ITableComponent adapter = getTableAdapter();
    java.awt.Rectangle rectangle = adapter.scrollCellToVisible(cell.getRow(), cell.getCol());
    java.lang.Object editor = activateEditor(cell, rectangle);
    editor = setEditorToReplaceMode(editor, replace);
    getRobot().type(editor, text);
}