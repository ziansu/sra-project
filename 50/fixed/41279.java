private double solutionLengthConstraint(int solutionLength) {
    if (solutionLength >= (MIN_SOLUTION_LENGTH)) {
        return 1.0;
    }else {
        return ((double) (solutionLength)) / (MIN_SOLUTION_LENGTH);
    }
}