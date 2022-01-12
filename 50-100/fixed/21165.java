public void solve() throws sudokuHelper.Solver.PuzzleNotLoadedException, sudokuHelper.Solver.PuzzleUnsolvableException {
    if ((loadedBoard) != null) {
        try {
            resultBoard = sudokuHelper.Solver.Solver.depthFirstSearch(loadedBoard);
        } catch (sudokuHelper.Solver.PuzzleUnsolvableException pue) {
            throw pue;
        }
    }else {
        throw new sudokuHelper.Solver.PuzzleNotLoadedException();
    }
}