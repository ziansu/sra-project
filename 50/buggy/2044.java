public static int solve(PuzzleBoard board, int hFunc) {
    return PuzzleSolver.aStar(board, 0, java.lang.Integer.MAX_VALUE, hFunc);
}