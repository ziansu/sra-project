private org.eclipse.swt.widgets.Button generateButton(org.eclipse.swt.widgets.Composite composite, java.lang.Integer style, java.lang.String text, java.lang.Boolean selection) {
    org.eclipse.swt.widgets.Button button = new org.eclipse.swt.widgets.Button(composite, style);
    button.setText((text != null ? text : button.getText()));
    button.setSelection((selection != null ? selection.booleanValue() : button.getSelection()));
    return button;
}