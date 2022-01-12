public void undo() {
    dragHelper.undo();
    alphaMaker.undo();
    invalidate();
}