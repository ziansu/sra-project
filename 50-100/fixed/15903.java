public void pushCommand(commands.Command cmd, boolean clear) {
    if (cmd == null) {
        java.lang.System.out.println("cmd is null");
        return ;
    }
    cmd.Apply(this);
    if (cmd.isUndoable) {
        commandStack.addFirst(cmd);
        if (clear) {
            redoStack.clear();
        }
    }
    if ((commandStack.size()) > (stackSize)) {
        commandStack.removeLast();
    }
}