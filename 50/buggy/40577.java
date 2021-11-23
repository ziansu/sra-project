public void initBoard() {
    puzzle = new boolean[cracker.Puzzle.PUZZLE_SIZE][cracker.Puzzle.PUZZLE_SIZE];
    puzzle[0][0] = true;
    numFilled = (((cracker.Puzzle.PUZZLE_SIZE) * ((cracker.Puzzle.PUZZLE_SIZE) + 1)) / 2) - 1;
}