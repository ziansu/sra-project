@java.lang.Override
public void execute(org.eclipse.core.runtime.IProgressMonitor monitor) throws org.eclipse.core.runtime.CoreException {
    java.lang.String hotfixBranchName = repository.getConfig().getHotfixBranchName(versionName);
    java.lang.String master = repository.getConfig().getMaster();
    mergeResult = mergeTo(monitor, hotfixBranchName, master);
    if (!(mergeResult.getMergeStatus().isSuccessful())) {
        return ;
    }
    finish(monitor, hotfixBranchName);
    safeCreateTag(monitor, versionName, org.eclipse.osgi.util.NLS.bind(CoreText.HotfixFinishOperation_hotfix, versionName));
}