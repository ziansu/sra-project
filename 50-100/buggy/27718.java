public void doit() {
    generateStateList();
    generateEventList();
    State initialState = unprocessedStates.get("0");
    makeChildren(initialState);
    if ((unprocessedStates.size()) != 0)
        fitInRemainingUnusedStates();
    
    statesMap = processedStates;
}