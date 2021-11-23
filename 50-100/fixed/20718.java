@java.lang.SuppressWarnings(value = "unused")
protected void notifyProjectRemoved(org.eclipse.core.resources.IProject project, INFO oldProjectInfo) {
    getLog().println((((getClass().getSimpleName()) + " info removed: ") + (project.getName())));
    fireUpdateEvent(new melnorme.lang.ide.core.project_model.UpdateEvent<INFO>(project, null));
}