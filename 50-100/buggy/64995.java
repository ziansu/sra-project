public boolean add(long puzzle, long predecessor) {
    int index = index(puzzle);
    boolean wasEmpty = (puzzles[index]) == 0;
    puzzles[index] = puzzle;
    predecessors[index] = predecessor;
    if (wasEmpty)
        (numberOfElements)++;
    
    return wasEmpty;
}