public static java.util.ArrayList<src.GameTree> expand(src.GameTree gt) {
    src.ComputerMoves cm = new src.ComputerMoves(gt.getBoard());
    java.util.ArrayList<src.Board> boards = cm.possibleBoards();
    for (src.Board b : boards) {
        java.lang.System.out.println(b);
        gt.addBranch(b);
    }
    return gt.getBranches();
}