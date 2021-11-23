@java.lang.Override
public org.eclipse.core.runtime.IStatus runInWorkspace(org.eclipse.core.runtime.IProgressMonitor monitor) throws org.eclipse.core.runtime.CoreException {
    SrcRepoActivator.INSTANCE.info((("about to import " + (compilationUnits.size())) + " compilation units"));
    int count = 0;
    for (org.eclipse.jdt.core.ICompilationUnit compilationUnit : compilationUnits) {
        importCompilationUnit(compilationUnit);
    }
    SrcRepoActivator.INSTANCE.info((("imported " + count) + " compilation units"));
    return org.eclipse.core.runtime.Status.OK_STATUS;
}