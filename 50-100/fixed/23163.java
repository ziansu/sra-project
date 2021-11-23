public boolean perfomAllIterationsWithLMBF(int numberOfIterations) {
    int iterations = 0;
    boolean merged = true;
    while ((merged && ((this.graph.getNodeCount()) > 1)) && ((numberOfIterations <= 0) || (iterations < numberOfIterations))) {
        iterations++;
        merged = perfomOneIterationWithLMBF();
    } 
    return merged;
}