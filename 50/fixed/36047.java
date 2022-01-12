@org.apache.shiro.authz.annotation.RequiresPermissions(value = "edit")
public java.lang.String edit() {
    java.lang.String value = ((java.lang.String) (javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id")));
    return edit(value);
}