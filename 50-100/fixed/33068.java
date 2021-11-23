@java.lang.Override
public void onBlur(com.google.gwt.event.dom.client.BlurEvent event) {
    if ((internal.getText().trim().isEmpty()) || (!(internal.getText().trim().matches(FieldType.NUMERIC.getRegex())))) {
        groupInternal.setValidationState(ValidationState.ERROR);
    }else {
        groupInternal.setValidationState(ValidationState.NONE);
    }
}