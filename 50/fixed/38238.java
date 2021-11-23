public void pop() {
    utility.Util.dbgOut(("State popped: " + (stateStack.peek())), 1);
    stateStack.peek().onExit();
    stateStack.pop();
}