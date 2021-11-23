public fr.inria.astor.core.entities.ProgramVariantValidationResult runRegression(fr.inria.astor.core.entities.ProgramVariant mutatedVariant, fr.inria.astor.core.setup.ProjectRepairFacade projectFacade) {
    try {
        java.net.URL[] bc = createClassPath(mutatedVariant, projectFacade);
        fr.inria.astor.core.validation.executors.JUnitExecutorProcess testProcessRunner = new fr.inria.astor.core.validation.executors.JUnitIndirectExecutorProcess(false);
        return executeRegressionTesting(mutatedVariant, bc, testProcessRunner, projectFacade);
    } catch (java.net.MalformedURLException e) {
        e.printStackTrace();
        return null;
    }
}