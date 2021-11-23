protected void renderSelectTag(javax.faces.context.FacesContext context, java.util.Map<java.lang.String, java.lang.Object> attrs, javax.faces.context.ResponseWriter rw, java.lang.String clientId) throws java.io.IOException {
    renderSelectTag(rw);
    renderSelectTagAttributes(attrs, rw, clientId);
    java.lang.Object selectedOption = getValue2Render(context);
    renderOptions(context, rw, selectedOption);
    renderInputTagEnd(attrs, rw);
}