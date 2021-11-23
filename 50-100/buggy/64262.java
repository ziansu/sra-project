public void update(org.eclipse.ice.datastructures.ICEObject.IUpdateable component) {
    if (component == (dataComp)) {
        org.eclipse.ui.PlatformUI.getWorkbench().getDisplay().asyncExec(new java.lang.Runnable() {
            public void run() {
                if (!(org.eclipse.ice.client.widgets.DataComponentComposite.this.isDisposed())) {
                    refresh();
                }else {
                    dataComp.unregister(org.eclipse.ice.client.widgets.DataComponentComposite.this);
                }
            }
        });
    }
    return ;
}