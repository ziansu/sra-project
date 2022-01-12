public boolean add(long puzzle, long predecessor) {
    int index = index(puzzle);
    if ((puzzles[index]) != 0) {
        return false;
    }
    puzzles[index] = puzzle;
    predecessors[index] = predecessor;
    (numberOfElements)++;
    return true;
}