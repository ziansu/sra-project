@java.lang.Override
public org.eclipse.swt.widgets.Composite createContents(org.eclipse.swt.widgets.Composite parent) {
    super.createContents(parent);
    org.eclipse.swt.widgets.Composite page = new org.eclipse.swt.widgets.Composite(parent, org.eclipse.swt.SWT.NONE);
    org.eclipse.swt.layout.GridLayout gridLayout = new org.eclipse.swt.layout.GridLayout();
    gridLayout.numColumns = 1;
    page.setLayout(gridLayout);
    createSquadTemplatesTable(page);
    return page;
}