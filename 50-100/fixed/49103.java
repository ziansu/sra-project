private final void setAllFalse() {
    nameConnectionText.setBackground(org.eclipse.swt.widgets.Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
    for (final org.eclipse.swt.widgets.Composite composite : subComposites) {
        composite.setVisible(false);
        for (final org.eclipse.swt.widgets.Control control : composite.getChildren()) {
            control.setVisible(false);
        }
    }
}