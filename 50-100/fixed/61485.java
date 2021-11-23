public void clearUndoables() {
    undoables.clear();
    undoIndex = -1;
    main.getRootTable().setUndoText("Undo");
    main.getRootTable().setRedoText("Redo");
    main.getRootTable().setUndoDisabled(true);
    main.getRootTable().setRedoDisabled(true);
}