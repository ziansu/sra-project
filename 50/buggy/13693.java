private void deleteAllMarkers() throws org.eclipse.core.runtime.CoreException {
    this.getProject().deleteMarkers(com.palantir.typescript.TypeScriptBuilder.PROBLEM_MARKER_TYPE, true, IResource.DEPTH_INFINITE);
    this.getProject().deleteMarkers(com.palantir.typescript.TypeScriptBuilder.TASK_MARKER_TYPE, true, IResource.DEPTH_INFINITE);
}