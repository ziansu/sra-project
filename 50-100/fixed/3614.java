public java.lang.Object getAsObject(javax.faces.context.FacesContext fc, javax.faces.component.UIComponent uic, java.lang.String value) {
    com.swn.eapp.om.dto.OrgTypeDTO obj = null;
    if ((value != null) && ((value.trim().length()) > 0)) {
        try {
            obj = new com.swn.eapp.om.dto.OrgTypeDTO();
        } catch (java.lang.Exception ex) {
        }
    }else {
        return null;
    }
    return obj;
}