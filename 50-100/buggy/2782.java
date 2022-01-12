private void calculateQueueBoard() {
    ida.ipl.Board b = getBoardAfterWait();
    if (programFinished(data.programFinished()))
        return ;
    
    int solution = calculateBoardSolution(b);
    if (solution > 0)
        data.getSolutions().addAndGet(solution);
    
}