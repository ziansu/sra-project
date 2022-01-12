public fr.inria.astor.core.entities.ProgramVariantValidationResult runRegression(fr.inria.astor.core.entities.ProgramVariant mutatedVariant, fr.inria.astor.core.setup.ProjectRepairFacade projectFacade) {
    try {
        java.net.URL[] bc = createClassPath(mutatedVariant, projectFacade);
        return this.runRegression(mutatedVariant, projectFacade, bc);
    } catch (java.net.MalformedURLException e) {
        e.printStackTrace();
        return null;
    }
}