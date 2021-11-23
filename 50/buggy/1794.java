public void focusGained(org.eclipse.swt.events.FocusEvent event) {
    site.fireEvent(this, IFormFieldListener.FOCUS_GAINED, checkbox.getText());
}