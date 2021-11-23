public static java.util.ArrayList<src.GameTree> expand(src.GameTree gt) {
    src.ComputerMoves cm = new src.ComputerMoves(gt.getBoard());
    java.util.ArrayList<src.Board> boards = cm.possibleBoards();
    for (src.Board b : boards) {
        gt.addBranch(b);
    }
    return gt.getBranches();
}