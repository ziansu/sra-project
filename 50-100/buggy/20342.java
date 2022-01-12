private void inputText(final java.lang.String text, boolean replace) throws org.eclipse.jubula.rc.common.exception.StepExecutionException {
    org.eclipse.jubula.rc.common.tester.adapter.interfaces.ITableComponent adapter = getTableAdapter();
    final org.eclipse.jubula.rc.common.implclasses.table.Cell cell = adapter.getSelectedCell();
    java.awt.Rectangle rectangle = adapter.scrollCellToVisible(cell.getRow(), cell.getCol());
    java.lang.Object editor = activateEditor(cell, rectangle);
    editor = setEditorToReplaceMode(editor, replace);
    getRobot().type(editor, text);
}