@java.lang.Override
protected void createPropsControls(org.eclipse.swt.widgets.Composite parent, int cols) {
    beanPropsTable = new org.fusesource.ide.camel.editor.globalconfiguration.beans.PropertyStyleChildTableControl(parent, org.eclipse.swt.SWT.NULL);
    beanPropsTable.setLayoutData(org.eclipse.jface.layout.GridDataFactory.fillDefaults().grab(true, true).span(cols, 2).create());
    beanPropsTable.setInput(this.parent);
}