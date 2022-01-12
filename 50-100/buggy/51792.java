public learntest.core.gentest.GentestResult randomGentestAndCompile(learntest.core.gentest.GentestParams params) {
    try {
        learntest.core.gentest.GentestResult result = getTestGenerator().genTest(params);
        compileAndLogTestSequences(result);
        return result;
    } catch (java.lang.Exception e) {
        learntest.core.LearningMediator.log.warn("Cannot generate testcase: [{}] {}", e, e.getMessage());
        return learntest.core.gentest.GentestResult.getEmptyResult();
    }
}