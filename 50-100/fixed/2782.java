private void calculateQueueBoard() {
    ida.ipl.Board b = getBoardAfterWait();
    if (programFinished(data.programFinished()))
        return ;
    
    java.lang.Integer solution = calculateBoardSolution(b);
    if ((solution != null) && (solution > 0))
        data.getSolutions().addAndGet(solution.intValue());
    
}