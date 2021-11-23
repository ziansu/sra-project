private teammates.ui.template.ElementTag createAddInstructorButton(boolean isDisabled) {
    teammates.ui.template.ElementTag button = new teammates.ui.template.ElementTag();
    button.setAttribute("type", "button");
    button.setAttribute("id", "btnShowNewInstructorForm");
    button.setAttribute("class", "btn btn-primary");
    if (isDisabled) {
        button.setAttribute("disabled", null);
    }
    return button;
}