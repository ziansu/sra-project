public org.eclipse.swt.widgets.Shell getShell() {
    if (org.eclipse.swt.SWT.getPlatform().equals("cocoa")) {
        if ((zetes.wings.ZetesDialog.emptyShell) == null)
            zetes.wings.ZetesDialog.emptyShell = new org.eclipse.swt.widgets.Shell(org.eclipse.swt.widgets.Display.getCurrent());
        
        return zetes.wings.ZetesDialog.emptyShell;
    }else {
        return parent.getShell();
    }
}