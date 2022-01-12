public int columnEnd() {
    if ((getStop()) != null)
        return ((getStop().getCharPositionInLine()) + (getStop().getText().length())) - 1;
    
    return -1;
}