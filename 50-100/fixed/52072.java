public void addToExecution() {
    int lineNumber = getVariable(varNum).read(this);
    if (executedLines.contains(lineNumber))
        return ;
    
    getLine(lineNumber).read().perform(this);
    executedLines.add(lineNumber);
}