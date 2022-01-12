public static grader.basics.execution.ResultingOutErr callMain(java.lang.String aMainName, java.lang.String[] args, java.lang.String... anInput) throws grader.basics.execution.NotRunnableException {
    if ((!(grader.basics.execution.BasicProjectExecution.isReRunInfiniteProceses())) && (grader.basics.project.CurrentProjectHolder.getOrCreateCurrentProject().isInfinite()))
        return null;
    
    if (grader.basics.settings.BasicGradingEnvironment.get().isForkMain()) {
        return grader.basics.execution.BasicProjectExecution.forkMain(aMainName, args, anInput);
    }else {
        return grader.basics.execution.BasicProjectExecution.invokeMain(aMainName, args, anInput);
    }
}