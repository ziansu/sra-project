public void generateOperationsChangeCellContent(plm.universe.bugglequest.BuggleWorldCell cell, java.lang.String oldContent, java.lang.String newContent, boolean oldHasContent, boolean newHasContent) {
    addOperation(new plm.universe.bugglequest.operations.ChangeCellContent(getCell().getX(), getCell().getY(), oldContent, newContent));
    addOperation(new plm.universe.bugglequest.operations.ChangeCellHasContent(getCell().getX(), getCell().getY(), oldHasContent, newHasContent));
    stepUI();
}