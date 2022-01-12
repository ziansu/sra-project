private void validateText() {
    if ((validator) != null) {
        org.jutils.ui.validation.Validity v;
        try {
            validator.validateText(field.getText());
            v = new org.jutils.ui.validation.Validity();
        } catch (org.jutils.ValidationException ex) {
            v = new org.jutils.ui.validation.Validity(ex.getMessage());
        }
        listenerList.signalValidity(v);
        setComponentValid(v.isValid);
    }
}