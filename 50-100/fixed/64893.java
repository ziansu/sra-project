public int printMoveQueue() {
    int howManyMoves = -1;
    if (TESTING) {
        if ((movesInQueue) != 0) {
            for (int i = 0; i < (movesInQueue); i++) {
                java.lang.System.out.println(moveQueue[i].toString());
            }
        }else
            java.lang.System.out.println("There are no moves in the queue");
        
        howManyMoves = movesInQueue;
    }
    return howManyMoves;
}