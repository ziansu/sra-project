protected final java.lang.String getOperationConsoleName(org.eclipse.core.resources.IProject project) {
    return useGlobalConsole() ? getGlobalConsoleName() : getProjectConsoleName(project);
}