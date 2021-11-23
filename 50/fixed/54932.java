public void removeModelFileFromProject(org.eclipse.core.resources.IFile modelFile, org.eclipse.core.resources.IProject project) {
    if (!(databases.containsKey(project)))
        return ;
    
    de.tud.cs.st.vespucci.architecture.listener.ArchitectureFileProcessor fileProcessor = observers.get(project);
    fileProcessor.deleteConstraintModel(modelFile);
}