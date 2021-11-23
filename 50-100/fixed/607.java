@java.lang.Override
public void partOpened(org.eclipse.ui.IWorkbenchPartReference partRef) {
    if (partRef.getId().equals(xstampp.stpapriv.ui.relation.UnsafeUnsecureEditor.ID)) {
        org.eclipse.ui.IWorkbenchPage page = org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        try {
            part = page.showView(PrivacyRelationsView.ID);
        } catch (org.eclipse.ui.PartInitException e) {
            e.printStackTrace();
        }
    }
}