public void sprawdzZdjecie(javax.faces.context.FacesContext fc, javax.faces.component.UIComponent c, java.lang.Object value) {
    if (value == null)
        return ;
    
    java.util.Locale loc = javax.faces.context.FacesContext.getCurrentInstance().getViewRoot().getLocale();
    java.util.ResourceBundle rb = java.util.ResourceBundle.getBundle("bundles.issi.uz.zgora.pl.messages", loc);
    org.apache.myfaces.custom.fileupload.UploadedFile plik = ((org.apache.myfaces.custom.fileupload.UploadedFile) (value));
    if (!(plik.getContentType().equals("image/jpeg"))) {
        throw new javax.faces.validator.ValidatorException(new javax.faces.application.FacesMessage(rb.getString("zdjecie.validator_typ")));
    }
}