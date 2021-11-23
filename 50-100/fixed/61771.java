@java.lang.Override
public void onBlur(com.google.gwt.event.dom.client.BlurEvent event) {
    if ((!(source.getText().trim().isEmpty())) && (!(source.getText().trim().matches(FieldType.PORT_RANGE.getRegex())))) {
        groupSource.setValidationState(ValidationState.ERROR);
    }else {
        groupSource.setValidationState(ValidationState.NONE);
    }
}