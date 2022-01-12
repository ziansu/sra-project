public static java.util.ArrayList<algorithm.Pattern> checkAllContPatterns(model.Board board, boolean isFirst) {
    java.util.ArrayList<algorithm.Pattern> retVal = algorithm.BoardChecker.checkBoardClosedPatCont(board, isFirst, 4);
    retVal.addAll(algorithm.BoardChecker.checkBoardClosedPatCont(board, isFirst, 5));
    retVal.addAll(algorithm.BoardChecker.checkBoardClosedPatCont(board, isFirst, 6));
    retVal.addAll(algorithm.BoardChecker.checkBoardOpenPatCont(board, isFirst, 3));
    retVal.addAll(algorithm.BoardChecker.checkBoardOpenPatCont(board, isFirst, 4));
    return retVal;
}