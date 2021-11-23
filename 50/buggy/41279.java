private double solutionLengthConstraint(int solutionLength) {
    if ((MIN_SOLUTION_LENGTH) < solutionLength) {
        return 1.0;
    }else {
        return ((double) (solutionLength)) / (MIN_SOLUTION_LENGTH);
    }
}