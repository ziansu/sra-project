public at.ac.tuwien.big.moea.experiment.executor.SearchExecutor withProblem(final at.ac.tuwien.big.moea.problem.ISearchProblem<?> problem) {
    super.withProblemClass(problem.getClass(), problem.getFitnessFunction(), problem.getSolutionGenerator());
    return this;
}