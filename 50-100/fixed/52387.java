@java.lang.Override
protected void init(org.eclipse.swt.widgets.Composite parent) {
    final org.eclipse.swt.widgets.Text txtField = getWidgetFactory().createText(parent, getInitialValue(), createTextStyle());
    txtField.setLayoutData(createPropertyFieldLayoutData());
    setControl(txtField);
    setUiObservable(org.eclipse.jface.databinding.swt.WidgetProperties.text(SWT.Modify).observeDelayed(500, txtField));
    setValidator(createValidator());
    txtField.addModifyListener(modifyListener);
}