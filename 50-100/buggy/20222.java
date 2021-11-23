public void validateDecimal(javax.faces.context.FacesContext facesContext, javax.faces.component.UIComponent component, java.lang.Object newValue) throws javax.faces.validator.ValidatorException {
    java.lang.String figures = newValue.toString();
    if (!(figures.matches("\\d+\\.?\\d*"))) {
        addMessage("errors.expense.totalNumber");
        throw new javax.faces.validator.ValidatorException(new javax.faces.application.FacesMessage(com.ozpathway.sw.erms.webapp.utils.FacesUtils.getText("errors.expense.totalNumber")));
    }
}