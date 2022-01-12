public gwt.material.design.addins.client.stepper.MaterialStep getCurrentStep() {
    if (((currentStepIndex) >= ((getWidgetCount()) - 1)) || ((currentStepIndex) < 0)) {
        return null;
    }
    com.google.gwt.user.client.ui.Widget w = getWidget(currentStepIndex);
    if (w instanceof gwt.material.design.addins.client.stepper.MaterialStep) {
        return ((gwt.material.design.addins.client.stepper.MaterialStep) (w));
    }
    return null;
}