private boolean solveH(int col) {
    if (col >= (s)) {
        (solutionCount)++;
        return true;
    }
    for (int i = 0; i < (s); i++) {
        if (Placeable(i, col)) {
            addQueen(i, col);
            if ((solveH((col + 1))) == true) {
                return true;
            }
            removeQueen(i, col);
        }
    }
    return false;
}