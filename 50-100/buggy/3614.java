public java.lang.Object getAsObject(javax.faces.context.FacesContext fc, javax.faces.component.UIComponent uic, java.lang.String value) {
    if ((value != null) && ((value.trim().length()) > 0)) {
        try {
            return new com.swn.eapp.om.dto.OrgTypeDTO();
        } catch (java.lang.Exception ex) {
            return null;
        }
    }else {
        return null;
    }
}