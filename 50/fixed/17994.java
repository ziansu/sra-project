protected void addAction(final org.bonitasoft.web.toolkit.client.ui.component.form.button.FormButton button) {
    if ((defaultAction) == null) {
        defaultAction = button.getAction();
    }
    buttons.append(button);
}