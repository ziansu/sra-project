public boolean canEvaluate() {
    if ((evals) < (evaluations_limit_)) {
        java.lang.System.out.println(((("evals and evallimit: " + (evals)) + " ") + (evaluations_limit_)));
        return true;
    }
    return false;
}