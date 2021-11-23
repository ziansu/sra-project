public void undo() {
    project.GlyphCommand gc = commandStack.pop();
    gc.unexecute();
}