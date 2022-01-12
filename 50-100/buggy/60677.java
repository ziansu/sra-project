private void writeResourceDemandToInternalAction(org.palladiosimulator.pcm.seff.InternalAction ia, java.lang.String resourceDemand) {
    java.lang.System.out.println(fileProcessor.isModified());
    java.util.List<org.palladiosimulator.pcm.seff.seff_performance.ParametricResourceDemand> prds = ia.getResourceDemand_Action();
    org.palladiosimulator.pcm.core.PCMRandomVariable prv;
    for (org.palladiosimulator.pcm.seff.seff_performance.ParametricResourceDemand prd : prds) {
        prv = prd.getSpecification_ParametericResourceDemand();
        prv.setSpecification(resourceDemand);
        prd.setSpecification_ParametericResourceDemand(prv);
    }
    java.lang.System.out.println(fileProcessor.isModified());
    fileProcessor.saveResource();
}