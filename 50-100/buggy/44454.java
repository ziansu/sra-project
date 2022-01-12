public SudokuPTUI solvePuzzle(SudokuPTUI grid) {
    if (grid.isGoal()) {
        return grid;
    }else {
        for (SudokuPTUI newGrid : grid.getSuccessors()) {
            if (grid.validate()) {
                SudokuPTUI solution = solvePuzzle(newGrid);
                if (solution != null)
                    return solution;
                
            }
        }
    }
    return null;
}