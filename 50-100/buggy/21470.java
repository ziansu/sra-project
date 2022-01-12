public static boolean areAllLimBranchScoresEqual(java.util.ArrayList<board.LimVirtualBoard> limVBoards) {
    if ((limVBoards.size()) == 0) {
        return true;
    }else {
        double first = limVBoards.get(0).branchScore;
        for (board.LimVirtualBoard l : limVBoards) {
            if ((l.branchScore) != first) {
                return false;
            }
        }
        return true;
    }
}