public void update(org.eclipse.ice.datastructures.ICEObject.IUpdateable component) {
    if (component == (dataComp)) {
        org.eclipse.ui.PlatformUI.getWorkbench().getDisplay().asyncExec(new java.lang.Runnable() {
            public void run() {
                refresh();
            }
        });
    }
    return ;
}