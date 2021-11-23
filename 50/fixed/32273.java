public boolean undo() {
    boolean status = false;
    if (!(commandStack.isEmpty())) {
        project.GlyphCommand gc = commandStack.pop();
        gc.unexecute();
        status = true;
    }
    return status;
}