@java.lang.Override
public void validate(java.lang.Object value) throws cz.cuni.mff.xrg.odcs.frontend.auxiliaries.InvalidValueException {
    if ((value.getClass()) == (java.lang.String.class)) {
        java.lang.String stringValue = ((java.lang.String) (value));
        if ((stringValue.length()) > (maxLength)) {
            throw new com.vaadin.data.Validator.InvalidValueException(cz.cuni.mff.xrg.odcs.frontend.i18n.Messages.getString("MaxLengthValidator.exception", maxLength, stringValue.length()));
        }
    }
}