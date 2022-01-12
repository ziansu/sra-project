public int calMaxSubseqSum2() {
    this.getInputs();
    int thisSum;
    int maxSum = 0;
    for (int i = 0; i < (sequence.length); i++) {
        thisSum = 0;
        for (int j = 0; j < (sequence.length); j++) {
            thisSum += sequence[j];
            if (thisSum > maxSum) {
                maxSum = thisSum;
            }
        }
    }
    return maxSum;
}