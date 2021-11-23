public boolean canEvaluate() {
    if ((evals) < (evaluations_limit_)) {
        return true;
    }
    return false;
}