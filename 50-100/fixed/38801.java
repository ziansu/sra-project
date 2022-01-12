@java.lang.Override
public void validate(java.lang.Object value) throws com.vaadin.data.Validator.InvalidValueException {
    java.lang.String query = ((java.lang.String) (value)).trim();
    if (!(query.toLowerCase().startsWith("select"))) {
        throw new com.vaadin.data.Validator.InvalidValueException(this.messages.getString("dialog.errors.validation.select"));
    }
}