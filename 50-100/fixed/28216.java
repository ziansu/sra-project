private void hideObject(final org.eclipse.swt.widgets.Control that, final boolean hideit) {
    org.eclipse.swt.layout.GridData GData = ((org.eclipse.swt.layout.GridData) (that.getLayoutData()));
    if (GData != null) {
        GData.exclude = true && hideit;
    }
    that.setVisible((true && (!hideit)));
    org.eclipse.swt.widgets.Control[] myArray = new org.eclipse.swt.widgets.Control[]{ that };
    layout(myArray);
}