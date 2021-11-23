public state.State pop() {
    utility.Util.dbgOut(("State popped: " + (stateStack.peek())), 1);
    stateStack.peek().onExit();
    return stateStack.pop();
}