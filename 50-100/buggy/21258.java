public void addModelFileToProject(org.eclipse.core.resources.IFile modelFile, org.eclipse.core.resources.IProject project) {
    if (!(databases.containsKey(project)))
        return ;
    
    de.tud.cs.st.vespucci.architecture.listener.ArchitectureFileProcessor fileProcessor = observers.get(project);
    if (!(fileProcessor.isModel(modelFile))) {
        fileProcessor.addConstraintModel(modelFile);
        fileProcessor.architectureDiagramAdded(modelFile);
    }else {
        fileProcessor.architectureDiagramChanged(modelFile);
    }
}