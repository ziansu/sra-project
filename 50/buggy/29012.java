public int columnEnd() {
    if ((getStop()) != null)
        return getStop().getCharPositionInLine();
    
    return -1;
}