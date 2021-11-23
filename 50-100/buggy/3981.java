public static eoss.problem.evaluation.ArchitectureEvaluatorParams getInstance(java.lang.String p) throws java.io.IOException, java.lang.ClassNotFoundException {
    if ((eoss.problem.evaluation.ArchitectureEvaluatorParams.instance) == null) {
        return new eoss.problem.evaluation.ArchitectureEvaluatorParams(p);
    }else {
        if (!(p.equals(eoss.problem.evaluation.ArchitectureEvaluatorParams.path))) {
            throw new java.lang.IllegalArgumentException("Given path is not the same as the instantiated params object");
        }
        return eoss.problem.evaluation.ArchitectureEvaluatorParams.instance;
    }
}