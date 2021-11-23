public learntest.core.gentest.GentestResult gentestAndCompile(java.util.List<double[]> solutions, java.util.List<sav.strategies.dto.execute.value.ExecVar> vars, learntest.core.gentest.GentestParams params) throws sav.common.core.SavException {
    learntest.core.LearningMediator.log.debug("gentest..");
    learntest.core.gentest.GentestResult result = getTestGenerator().genTestAccordingToSolutions(params, solutions, vars, new gentest.junit.JWriter());
    if (!(result.isEmpty())) {
        learntest.core.LearningMediator.log.debug("compile..");
        compileAndLogTestSequences(result);
    }
    return result;
}