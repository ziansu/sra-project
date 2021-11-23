public void generateOperationsChangeCellContent(plm.universe.bugglequest.BuggleWorldCell cell, java.lang.String oldContent, java.lang.String newContent, boolean oldHasContent, boolean newHasContent) {
    addOperation(new plm.universe.bugglequest.operations.ChangeCellContent(cell.getX(), cell.getY(), oldContent, newContent));
    addOperation(new plm.universe.bugglequest.operations.ChangeCellHasContent(cell.getX(), cell.getY(), oldHasContent, newHasContent));
    stepUI();
}