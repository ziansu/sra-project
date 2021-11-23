private boolean execute_STACK_ISEMPTY() {
    int stackIndex = getStackIndexArg();
    if (stackIndex < 0)
        return false;
    
    if (!(isNext(',')))
        return false;
    
    if (!(getNVar()))
        return false;
    
    if (!(checkEOL()))
        return false;
    
    java.util.Stack thisStack = com.rfo.basic.Run.theStacks.get(stackIndex);
    double empty = (thisStack.isEmpty()) ? 1 : 0;
    com.rfo.basic.Run.NumericVarValues.set(theValueIndex, empty);
    return true;
}