private void decisionPositions() {
    numOfDecisionPositions = 0;
    avgChoiceNum = 0.0;
    int optionCount = 0;
    for (int i = 0; i < (this.getNumberOfVertices()); i++) {
        int moves = outDegree(i);
        if (moves > 1)
            (numOfDecisionPositions)++;
        
        optionCount += moves;
    }
    avgChoiceNum = (optionCount * 1.0) / ((this.getNumberOfVertices()) * 1.0);
}