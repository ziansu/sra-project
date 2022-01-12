private boolean checkOpUndo(java.lang.String first) {
    if (running_history_undo.empty())
        return false;
    
    int prev_size = running_history_undo.peek().size();
    int current_size = running_history.size();
    if (prev_size >= current_size)
        return true;
    
    return isOp(first);
}