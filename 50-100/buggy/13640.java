@org.junit.Test
public void bruteForceTest() {
    java.lang.String boardstring = "094000130000000000000076002080010000032000000000200060000050400000008007006304008";
    java.lang.String solvedstring = "794582136268931745315476982689715324432869571157243869821657493943128657576394218";
    SudokuBoard unsolvedboard = new SudokuBoard(boardstring);
    SudokuBoard solvedboard = new SudokuBoard(solvedstring);
    SudokuSolver solver = new SudokuSolver();
    SudokuBoard compareboard = solver.bruteForceSolve(unsolvedboard);
    org.junit.Assert.assertTrue(solvedboard.equals(compareboard));
}