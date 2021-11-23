public java.lang.Object getAsObject(javax.faces.context.FacesContext fc, javax.faces.component.UIComponent uic, java.lang.String value) {
    if ((value != null) && ((value.trim().length()) > 0)) {
        try {
            de.hslu.infomac.notenverwaltung.beans.PersonBean personBean = new de.hslu.infomac.notenverwaltung.beans.PersonBean();
            return personBean.getPersonById(java.lang.Long.valueOf(value));
        } catch (java.lang.NumberFormatException e) {
            throw new javax.faces.convert.ConverterException(new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_ERROR, "Conversion Error", "Kein Valider Benutzer."));
        }
    }else {
        return null;
    }
}