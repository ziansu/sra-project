protected void pop(C required) {
    C poppedEntry = callStack.remove(((callStack.size()) - 1));
    assert poppedEntry == required : "Got the wrong build stack entry from the stack";
}