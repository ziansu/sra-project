public void executeWarning(javax.faces.context.FacesContext context) {
    javax.faces.component.UIInput parent = ((javax.faces.component.UIInput) (getParent()));
    if (isValueSetOrValidateEmptyValues(parent)) {
        com.knitelius.jsfwarn.validator.ValidationResult validationResult = executeValidator(context, parent);
        if (validationResult.validationFailed()) {
            context.addMessage(parent.getClientId(), validationResult.getFacesMessage());
            setWarningStyle(parent, context);
        }else {
            removeWarningStyle(parent, context);
        }
    }else {
        removeWarningStyle(parent, context);
    }
}