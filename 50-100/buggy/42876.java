public static org.ofbiz.widget.model.ModelForm createModelForm(org.w3c.dom.Document formFileDoc, org.ofbiz.entity.model.ModelReader entityModelReader, org.ofbiz.service.DispatchContext dispatchContext, java.lang.String formLocation, java.lang.String formName) {
    org.w3c.dom.Element formElement = org.ofbiz.base.util.UtilXml.firstChildElement(formFileDoc.getDocumentElement(), "form", "name", formName);
    if (formElement == null) {
        formElement = org.ofbiz.base.util.UtilXml.firstChildElement(rootElement, "grid", "name", formName);
    }
    return org.ofbiz.widget.model.FormFactory.createModelForm(formElement, entityModelReader, dispatchContext, formLocation, formName);
}