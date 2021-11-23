public void clearUndoables() {
    undoables.clear();
    undoIndex = -1;
    main.getRootTable().setUndoDisabled(true);
    main.getRootTable().setRedoDisabled(true);
    main.getRootTable().setUndoText("Undo");
    main.getRootTable().setRedoText("Redo");
}