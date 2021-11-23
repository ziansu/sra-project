public void runBuildToolAndProcessOutput(java.lang.ProcessBuilder pb, org.eclipse.core.runtime.IProgressMonitor pm) throws melnorme.utilbox.concurrency.OperationCancellation, melnorme.utilbox.core.CommonException, org.eclipse.core.runtime.CoreException {
    processBuildOutput(runBuildTool(opInfo, pb, pm));
}