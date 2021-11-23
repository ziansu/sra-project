public void createPartControl(org.eclipse.swt.widgets.Composite parent) {
    parentComposite = parent;
    synchronized(treeLock) {
        fileTree = new org.eclipse.jface.viewers.TreeViewer(parent);
        fileTree.getTree().setLayoutData(new org.eclipse.swt.layout.GridData(org.eclipse.swt.SWT.FILL, org.eclipse.swt.SWT.FILL, true, true, 2, 1));
        fileTree.setContentProvider(new org.eclipse.ptp.rdt.sync.ui.SyncMergeFileTreeViewer.ConflictedFilesContentProvider());
        if ((project) != null) {
            fileTree.setInput(project);
        }
    }
}