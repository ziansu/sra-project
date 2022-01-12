public int getNextPosition() {
    if ((entries.size()) == 0)
        return 0;
    
    return (entries.last().getPosition()) + 1;
}