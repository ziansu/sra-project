public void setGlobalModelFileForProject(org.eclipse.core.resources.IFile modelFile, org.eclipse.core.resources.IProject project) {
    de.tud.cs.st.vespucci.architecture.listener.ArchitectureFileProcessor fileProcessor = observers.get(project);
    if (!(fileProcessor.isGlobalModel(modelFile))) {
        fileProcessor.setEnsembleRepository(modelFile);
        fileProcessor.architectureDiagramAdded(modelFile);
    }else {
        fileProcessor.architectureDiagramChanged(modelFile);
    }
}