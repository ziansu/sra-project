@java.lang.Override
public void onBlur(com.google.gwt.event.dom.client.BlurEvent event) {
    if ((output.getText().trim().isEmpty()) || (!(output.getText().trim().matches(FieldType.ALPHANUMERIC.getRegex())))) {
        groupOutput.setValidationState(ValidationState.ERROR);
    }else {
        groupOutput.setValidationState(ValidationState.NONE);
    }
}