private boolean executeDO() {
    if (!(checkEOL()))
        return false;
    
    DoStack.push(ExecutingLineIndex);
    return true;
}