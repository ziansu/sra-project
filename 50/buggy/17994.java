protected void addAction(final org.bonitasoft.web.toolkit.client.ui.component.form.button.FormButton button) {
    if ((this.defaultAction) == null) {
        this.defaultAction = button.getAction();
    }
    this.buttons.append(button);
}