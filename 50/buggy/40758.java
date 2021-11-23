private boolean executeDO() {
    if (!(checkEOL()))
        return false;
    
    DoStack.push(((ExecutingLineIndex) - 1));
    return true;
}