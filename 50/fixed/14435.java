private boolean parseCFileAndAddToModel(org.eclipse.core.resources.IResourceDelta delta) {
    fzi.mottem.code2model.cdt2ecore.CDTExtractorJob job = new fzi.mottem.code2model.cdt2ecore.CDTExtractorJob(delta.getResource().getProject());
    job.setPriority(Job.LONG);
    job.schedule();
    return true;
}