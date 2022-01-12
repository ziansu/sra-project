@java.lang.Override
public void createPartControl(org.eclipse.swt.widgets.Composite parent) {
    toolkit = new org.eclipse.ui.forms.widgets.FormToolkit(parent.getDisplay());
    org.eclipse.swt.layout.GridLayout gridLayout = new org.eclipse.swt.layout.GridLayout();
    gridLayout.numColumns = 2;
    gridLayout.makeColumnsEqualWidth = true;
    parent.setLayout(gridLayout);
    createListSection(toolkit, parent);
    createExpressionSection(toolkit, parent);
}