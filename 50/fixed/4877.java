@java.lang.Override
public java.lang.String getAsString(javax.faces.context.FacesContext context, javax.faces.component.UIComponent component, java.lang.Object value) {
    if (value instanceof models.Group) {
        return ((models.Group) (value)).getName();
    }
    return null;
}