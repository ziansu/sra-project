private boolean execute_STACK_CLEAR() {
    int stackIndex = getStackIndexArg();
    if (stackIndex < 0)
        return false;
    
    if (!(checkEOL()))
        return false;
    
    java.util.Stack thisStack = com.rfo.basic.Run.theStacks.get(stackIndex);
    while (!(thisStack.isEmpty())) {
        thisStack.pop();
    } 
    return true;
}