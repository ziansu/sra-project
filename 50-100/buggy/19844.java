@java.lang.Override
public void onBlur(com.google.gwt.event.dom.client.BlurEvent event) {
    if (((permittedNw.getText().trim().length()) != 0) && (!(permittedNw.getText().trim().matches(FieldType.NETWORK.getRegex())))) {
        groupPermittedNw.setValidationState(ValidationState.ERROR);
    }else {
        groupPermittedNw.setValidationState(ValidationState.NONE);
    }
}