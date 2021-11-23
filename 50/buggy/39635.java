public org.eclipse.core.runtime.IStatus runInUIThread(org.eclipse.core.runtime.IProgressMonitor monitor) {
    logger.debug((("Browser refresh [" + origin) + "]"));
    return reloadDataXml();
}