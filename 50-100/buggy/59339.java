public void validAddress(javax.faces.context.FacesContext context, javax.faces.component.UIComponent component, java.lang.Object value) throws javax.faces.validator.ValidatorException {
    java.lang.String componentValue = ((java.lang.String) (value));
    java.lang.String id = component.getId();
    java.lang.String msg = ("invalid" + " ") + id;
    java.lang.String regExp = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
    java.lang.System.out.print(("component name +++++++" + id));
    if (componentValue.isEmpty()) {
        throw new javax.faces.validator.ValidatorException(new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_ERROR, msg, msg));
    }
}