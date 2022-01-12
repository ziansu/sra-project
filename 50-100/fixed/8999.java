public void refreshModules() {
    try {
        tern.eclipse.ide.core.IWorkingCopy workingCopy = getWorkingCopy();
        workingCopy.addWorkingCopyListener(this);
        modulesBlock.refresh(workingCopy.getAllModules(), workingCopy.getCheckedModules());
    } catch (java.lang.Throwable e) {
        tern.eclipse.ide.internal.ui.Trace.trace(Trace.SEVERE, "Error while loading tern project", e);
    }
}